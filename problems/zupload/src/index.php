<?php
error_reporting(0);
if ($_SERVER['REQUEST_METHOD'] == 'GET') {
    if (!isset($_GET['action'])) {
        header('Location: /?action=upload');
        die();
    }
    if ($_GET['action'][0] === '/' || strpos($_GET['action'], '..') !== false) {
        die('<h1>Invalid action</h1>');
    }
    die(file_get_contents($_GET['action']));
} else if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $file = $_FILES['file'];
    $file_name = $file['name'];
    $file_tmp = $file['tmp_name'];
    $file_size = $file['size'];
    $file_error = $file['error'];
    
    $file_ext = explode('.', $file_name);
    $file_ext = strtolower($file_ext[1]);
    
    $allowed = array('zip');
    
    if (in_array($file_ext, $allowed)) {
        if ($file_error === 0) {
            if ($file_size <= 2097152) {
                $file_destination = 'uploads/' . $file_name;
    
                if (move_uploaded_file($file_tmp, $file_destination)) {
                    echo json_encode(array(
                        'status' => 'ok',
                        'message' => 'File uploaded successfully',
                        'url' => preg_split('/\?/', $_SERVER['HTTP_REFERER'])[0] . $file_destination
                    ));
                }
            }
        }
    } else {
        echo json_encode(array(
            'status' => 'error',
            'message' => 'Only zip files are allowed'
        ));
    }
}
