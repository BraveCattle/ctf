import docker
from pwn import *

TARGET_PORT = 12345
IMAGE_NAME = 'httpd'

class DockerSpec:
    def __init__(self, image_name):
        self.image_name = image_name
        self.client = docker.from_env()
        self.container = None
        
    def run(self, name):
        if self.container is None:
            port = 33333
            self.container = self.client.containers.run(self.image_name, detach=True, name=name, auto_remove=True, ports={TARGET_PORT:port})
            return port
        return None
    
    def stop(self):
        if self.container:
            try:
                self.container.stop()
            except docker.errors.APIError:
                print("This token is not in Server's database")
            self.container = None

try:
    proc = DockerSpec(IMAGE_NAME)
    container_name = "this_is_my_name"
    port = proc.run(container_name)
    print(port)
    pause()

except Exception as e :
    print(e)