package com.foodie.app.fooddelivery.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Favourite")
public class Favourite {
  @Id
  private String id;
  private String foodId;
  private String foodName;
  private String image;
  private String hotelName;
  private String cityName;
  private String price;
  private String userId;
public String getId() {
    return id;
}
public void setId(String id) {
    this.id = id;
}
public String getFoodId() {
    return foodId;
}
public void setFoodId(String foodId) {
    this.foodId = foodId;
}
public String getFoodName() {
    return foodName;
}
public void setFoodName(String foodName) {
    this.foodName = foodName;
}
public String getImage() {
    return image;
}
public void setImage(String image) {
    this.image = image;
}
public String getHotelName() {
    return hotelName;
}
public void setHotelName(String hotelName) {
    this.hotelName = hotelName;
}
public String getCityName() {
    return cityName;
}
public void setCityName(String cityName) {
    this.cityName = cityName;
}
public String getPrice() {
    return price;
}
public void setPrice(String price) {
    this.price = price;
}
public String getUserId() {
    return userId;
}
public void setUserId(String userId) {
    this.userId = userId;
}
public Favourite() {
}
public Favourite(String id, String foodId, String foodName, String image, String hotelName, String cityName,
        String price, String userId) {
    this.id = id;
    this.foodId = foodId;
    this.foodName = foodName;
    this.image = image;
    this.hotelName = hotelName;
    this.cityName = cityName;
    this.price = price;
    this.userId = userId;
}
@Override
public String toString() {
    return "Favourite [cityName=" + cityName + ", foodId=" + foodId + ", foodName=" + foodName + ", hotelName="
            + hotelName + ", id=" + id + ", image=" + image + ", price=" + price + ", userId=" + userId + "]";
}



  
}
