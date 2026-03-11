

class AnimalTwo{
  override def toString: String = "i am an animal!";
}

class MammelTwo extends AnimalTwo {
  override def toString: String = "i am a mammel";
}

class DogTwo extends MammelTwo {
  override def toString: String = "i am a dog";
}

class ZooTwo {
  def addAnimal[T >: DogTwo](animal: T): Unit={
    println(animal.toString);
  }
}


object LowerBoundExampleTwo {
  def main(args: Array[String]): Unit = {
    val animal = new AnimalTwo();
    val mammal = new MammelTwo();
    val dog = new DogTwo();

    val zoo = new ZooTwo();

    zoo.addAnimal(animal);
    zoo.addAnimal(mammal);
    zoo.addAnimal(dog);
  }
}