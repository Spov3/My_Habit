<?php

$time1 = new stdClass();
$time1->id = 1;
$time1->category = 'Work';
$time1->duration = '40 min';

$time2 = new stdClass();
$time2->id = 2;
$time2->category = 'Study';
$time2->duration = '50 min';

$time3 = new stdClass();
$time3->id = 3;
$time3->category = 'Personal';
$time3->duration = '120 min';

$time = array($time1, $time2, $time3);

$json = json_encode($time);

echo $json;