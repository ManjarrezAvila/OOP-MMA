<?php

require_once('Pet.php');
require_once('Account.php');
require_once('AdoptiveFamily.php');

$lilcat = new Pet("cat", "P05348", "Olly", "small", "black", "3 months");
$lilcat->printDataPet();

$Hernandez = new AdoptiveFamily(new Account("AF05348", "Hernandez" "7221234567"));
$Hernandez->printDataAdoptiveFamily();


?>