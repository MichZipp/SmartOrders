package kaist.customerapplication.RestaurantOwnerApplicationCommunication;


import com.google.gson.Gson;

import kaist.customerapplication.RestaurantOwnerApplicationCommunication.data.Order;

public class OrderJsonSerializer {

    public static Order deserialize(String json){
        Gson gson = new Gson();
        Order resInfo = gson.fromJson(json,Order.class);
        return resInfo;
    }

    public static String serialize(Order info){
        Gson gson = new Gson();
        String json = gson.toJson(info);
        return json;
    }
}
