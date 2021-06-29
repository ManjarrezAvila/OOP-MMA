function Pet(pettype, id, name) {
    this.pettype = pettype;
    this.id = id;
    this.name = name;
    this.size;
    this.color;
    this.age;
}

Pet.prototype.printDataPet = function () {
    console.log(this.pettype)
    console.log(this.id)
    console.log(this.name)
}