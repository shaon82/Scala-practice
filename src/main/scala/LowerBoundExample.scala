

class Animal {
  override def toString: String = "Animal";
}

class Mammal extends Animal {
  override def toString: String = "Mammal";
}

class Dog extends Animal {
  override def toString: String = "Dog";
}

class Zoo {

  def addAnimal[T >: Mammal](animal: T): Unit ={
    println("Added to zoo: " + animal)
  }
}

object LowerBoundExample {
  def main(args : Array[String]): Unit = {
    val animal = new Animal();
    val mammal = new Mammal();
    val dog = new Dog();

    val zoo = new Zoo();

    zoo.addAnimal(animal);
    zoo.addAnimal(mammal);
    zoo.addAnimal(mammal);
    zoo.addAnimal(dog);
  }
}