<?php

$time1 = new stdClass();
$time1->id = 1;
$time1->category = 'Work';
$time1->duration = '30 min';

$time2 = new stdClass();
$time2->id = 2;
$time2->category = 'Study';
$time2->duration = '60 min';

$time3 = new stdClass();
$time3->id = 3;
$time3->category = 'Personal';
$time3->duration = '120 min';

$time4 = new stdClass();
$time4->id = 3;
$time4->category = 'Work';
$time4->duration = '25 min';

$time5 = new stdClass();
$time5->id = 3;
$time5->category = 'Study';
$time5->duration = '30 min';

$time = array($time1, $time2, $time3, $time4, $time5);

$json = json_encode($time);

echo $json;