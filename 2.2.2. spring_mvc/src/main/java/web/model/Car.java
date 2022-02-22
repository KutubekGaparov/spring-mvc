package web.model;

public class Car {

   private int id;
   private String name;
   private String color;

   public Car() {
   }

   public Car(String name, String color) {
      this.name = name;
      this.color = color;
   }

   public Car(int id, String name, String color) {
      this.id = id;
      this.name = name;
      this.color = color;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   @Override
   public String toString() {
      return "Car{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", color='" + color + '\'' +
              '}';
   }
}
