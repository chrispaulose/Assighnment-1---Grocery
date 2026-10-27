
public abstract class Vehicle {
private String vehicleid;
private String vehiclenum;
private String brand;
private String model;
private double rentalRate;
private boolean availablity;
  Vehicle(String vehicleid,String vehiclenum,String brand,String model,double rentalRate){
	  this.vehicleid=vehicleid;
	  this.vehiclenum=vehiclenum;
	  this.brand=brand;
	  this.model=model;
	  this.rentalRate=rentalRate;
	  this.availablity=true;
	  
  }
  public String getvehicleid() {
	  return vehicleid;
  }
    public void  setvehicleid( String vehicleid) {
    	 this.vehicleid=vehicleid;
    }
  public String getvehiclenum() {
	  return vehiclenum;	  
  }
   public void setvehiclenum(String vehiclenum) {
	   this.vehiclenum=vehiclenum;
   }
  public String getbrand() {
	  return brand;
  }
  public void setbrand(String brand) {
	  this.brand=brand;
  }
  public String getmodel() {
	  return model;
  }
  public void setmodel(String model) {
	  this.model=model;
  }
  public double getrentalRate() {
	  return rentalRate;
  }
  public void setrentalRate(double rentalRate) {
	  this.rentalRate=rentalRate;
  }
  public boolean getavailablity() {
	 return availablity ;
  }
  public void setavailability(boolean availablity) {
	  this.availablity=availablity;
  }
  
}
