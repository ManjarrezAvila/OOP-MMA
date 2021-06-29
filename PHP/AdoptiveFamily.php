<?php
class AdoptiveFamily{
    public $id;
}

public function_construct($id){
    $this->id=$id;
}

public function PrintCataPet(){
        echo "ID: {$this->id->id}, Name: {$this->id->name}, Cellphone: {$this->id->cellphone}";
    }
?>