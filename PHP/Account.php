<?php
class Account {
    public $id;
    public $name;
    public $address;
    public $cellphone;

    public function_construct($id, $name, $cellphone){
        $this->id = $id;
        $this->name = $name;
        $this->cellphone = $cellphone;
    }
}
?>