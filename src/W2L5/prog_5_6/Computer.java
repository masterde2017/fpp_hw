package W2L5.prog_5_6;

public class Computer implements Cloneable{
	private String manufacturer;
	private String processor;
	private int ramSize;
	private double processorSpeed;
	public Computer(String manufacturer,  String processor, int ramSize, double processorSpeed ) {
		this.manufacturer=manufacturer;
		this.processor=processor;
		this.ramSize=ramSize;
		this.processorSpeed=processorSpeed;
	}
	public int getRamSize() {
		return ramSize;
	}
	
	public double getProcessorSpeed() {
		return processorSpeed;
	}
	
	
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public double computePower() {
		return ramSize*processorSpeed; 
	}
	@Override
	public String toString() {
		return "Computer [manufacturer=" + manufacturer + ", processor=" + processor + ", ramSize=" + ramSize
				+ ", processorSpeed=" + processorSpeed + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result +  manufacturer.hashCode();
		result = prime * result + processor.hashCode();
		long temp;
		temp = Double.doubleToLongBits(processorSpeed);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ramSize;
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
		Computer other = (Computer) obj;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (processor == null) {
			if (other.processor != null)
				return false;
		} else if (!processor.equals(other.processor))
			return false;
		if (Double.doubleToLongBits(processorSpeed) != Double.doubleToLongBits(other.processorSpeed))
			return false;
		if (ramSize != other.ramSize)
			return false;
		return true;
	}
	
	public Computer clone() throws CloneNotSupportedException {
		return (Computer) super.clone();
		
	}
	
	

}
