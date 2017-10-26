package by.home.test10;

public class Car {
String model= "Zepar";

@Override
public String toString() {
	return "��� ������ ������ "+model+" ������";
	
}
public Car() {	
	
}
public Car(String model) {
	this.model=model;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((model == null) ? 0 : model.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Car other = (Car) obj;
	if (model == null) {
		if (other.model != null)
			return false;
	} else if (!model.equals(other.model))
		return false;
	return true;
}


}
