<?php

$servername = "localhost";
$username = "your username";
$password = "your password";
$database = "database name";


$conn = new mysqli($servername, $username, $password, $database);
 

if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

?>