<?php
class Pet {
    public $species;
    public $id;
    public $name;
    public $size;
    public $color;
    public $age;

    public function_construct($species, $id, $name, $size, $color, $age){
        $this->species = $species;
        $this->id = $id;
        $this->name = $name;
        $this->size = $size;
        $this->color = $color;
        $this->age = $age;
    }



    public function PrintCataPet(){
        echo "Species: $this->species, ID: $this->id, Name; $this->name"
        echo "Size: $this->size, Color: $this->color, Age; $this->age"
    }
}
?>