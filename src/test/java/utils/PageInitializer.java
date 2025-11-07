package utils;

import pages.CartPage;
import pages.DashboardPage;
import pages.LoginPage;
import pages.WishlistPage;

public class PageInitializer {

    public static DashboardPage dashboardPage;
    public static LoginPage loginPage;
    public static CartPage cartPage;
    public static WishlistPage wishlistPage;

    public static void initializerPageObjects(){
        dashboardPage=new DashboardPage();
        loginPage=new LoginPage();
        cartPage=new CartPage();
        wishlistPage=new WishlistPage();
    }
}
