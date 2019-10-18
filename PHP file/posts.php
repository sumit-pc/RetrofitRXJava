<?php

require_once 'DbConnect.php';

$stmt = $conn->prepare("SELECT name, email_id, contact_number FROM user_master");
$stmt->execute();
$result = $stmt->get_result();
$outp = $result->fetch_all(MYSQLI_ASSOC);
$stmt->close();
echo json_encode($outp);
$conn->close();



?>