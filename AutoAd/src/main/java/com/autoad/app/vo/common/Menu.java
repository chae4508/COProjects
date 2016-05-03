package com.autoad.app.vo.common;

import java.util.LinkedList;
import java.util.List;

public class Menu {
	private String menuId;
	
	private String menuTxt;
	
	private String menuUrl;
	
	private String menuActive;

	public String getMenuId() {
		return menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public String getMenuTxt() {
		return menuTxt;
	}

	public void setMenuTxt(String menuTxt) {
		this.menuTxt = menuTxt;
	}

	public String getMenuUrl() {
		return menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	} 
	
    public String getMenuActive() {
		return menuActive;
	}

	public void setMenuActive(String menuActive) {
		this.menuActive = menuActive;
	}

	public static List<Menu> getMenuList(String url){
    	List<Menu> menuList = new LinkedList<Menu>();
    	
    	Menu menu = new Menu();
    	menu.setMenuId("M01");
    	menu.setMenuTxt("URL管理");
    	menu.setMenuUrl("/app/management/manageUrl.do");
    	menu.setMenuActive(menu.getMenuUrl().equals(url)?" class='active'":"");
    	menuList.add(menu);
    	
    	menu = new Menu();
    	menu.setMenuId("M02");
    	menu.setMenuTxt("user-agent");
    	menu.setMenuUrl("/app/management/userAgent.do");
    	menu.setMenuActive(menu.getMenuUrl().equals(url)?" class='active'":"");
    	menuList.add(menu);
    	
    	menu = new Menu();
    	menu.setMenuId("M03");
    	menu.setMenuTxt("PV履歴");
    	menu.setMenuUrl("/app/history/pageView.do");
    	menu.setMenuActive(menu.getMenuUrl().equals(url)?" class='active'":"");
    	menuList.add(menu);
    	
    	menu = new Menu();
    	menu.setMenuId("M04");
    	menu.setMenuTxt("IP履歴");
    	menu.setMenuUrl("/app/history/ipHistory.do");
    	menu.setMenuActive(menu.getMenuUrl().equals(url)?" class='active'":"");
    	menuList.add(menu);
    	
    	menu = new Menu();
    	menu.setMenuId("M05");
    	menu.setMenuTxt("生存確認");
    	menu.setMenuUrl("/app/device/checkAlive.do");
    	menu.setMenuActive(menu.getMenuUrl().equals(url)?" class='active'":"");
    	menuList.add(menu);
    	
    	menu = new Menu();
    	menu.setMenuId("M06");
    	menu.setMenuTxt("広告タグ一覧");
    	menu.setMenuUrl("/app/advertise/tagList.do");
    	menu.setMenuActive(menu.getMenuUrl().equals(url)?" class='active'":"");
    	menuList.add(menu);
    	
    	menu = new Menu();
    	menu.setMenuId("M07");
    	menu.setMenuTxt("広告会社");
    	menu.setMenuUrl("/app/advertise/adCompList.do");
    	menu.setMenuActive(menu.getMenuUrl().equals(url)?" class='active'":"");
    	menuList.add(menu);
    	
    	return menuList;
    }
}
