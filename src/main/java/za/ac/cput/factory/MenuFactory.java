/*
*Author :Alizwa Solibanzi
* Student no: 220001499
* APPLICATION DEVELOPMENT PRACTICE 3
* ASSIGNMNET 1
*
 */
package za.ac.cput.factory;

import za.ac.cput.entity.Menu;
import za.ac.cput.util.Helper;

public class MenuFactory {
    public static Menu createMenu(  String  Menu_Items, double Menu_Price){
        if(Helper.isNullorEmpty(Menu_Items))
            return  null;
            if(Helper.isEmpty(Menu_Price))
                return  null;

        return  new Menu.Builder().setMenu_ID(Helper.generateID())
                                   .setMenu_Items(Menu_Items)
                                  .setMenu_Price(Menu_Price)
                                   .build();

    }
}
