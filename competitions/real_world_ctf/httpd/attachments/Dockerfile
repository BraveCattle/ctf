FROM ubuntu:22.04

RUN sed -i s@/archive.ubuntu.com/@/mirrors.tuna.tsinghua.edu.cn/@g /etc/apt/sources.list
RUN apt-get clean
RUN dpkg --add-architecture i386 && apt-get update && apt-get install -qy libc6:i386
# 
COPY httpd /home/httpd
COPY www /home/www
COPY run.sh /home/run.sh
COPY flag /flag
COPY readflag /readflag

RUN chmod +x /home/httpd
RUN chmod +x /home/run.sh
RUN chmod 400 /flag
RUN chmod u+s readflag

EXPOSE 12345
USER www-data
CMD [ "/home/run.sh"]