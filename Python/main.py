from pet import Pet

if __name__=="__main__":
    print("Hola Mundo")
    dog = Pet()
    dog.pettype = "dog"
    dog.id = 3258
    dog.name = "Firulais"
    dog.size = "small"
    dog.color = "white"
    dog.age = 4
    print(vars(dog))

    lilcat = Pet()
    lilcat.pettype = "cat"
    lilcat.id = 2645
    lilcat.name = "Olly"
    lilcat.size = "extra small"
    lilcat.color = "black"
    lilcat.age = 1
    print(vars(lilcat))