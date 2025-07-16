package retangulo;

public class Retangulo {
 public double width;
 public double height;
 
 
 public void InputValue(double width,double height ) {
	 this.height=height;
	 this.width=width;
	 
	 
 }
 public double area( ){
	
	 
	return (this.width * this.height); 
	 
 }
 public double perimetro() {
	
	 
	 return (this.width *2)+ (this.height*2); 
 }
 public double diagonal( ) {
	 
	 
	 return Math.sqrt(this.width *this.width + this.height*this.height); 
 }
 public String toString() {
	 
	 return "Área: " + area() + "\nPerímetro: " + perimetro() + "\nDiagonal: " + diagonal();
			 
	 
 }
 
 
}
