package com.example.intentrecycleviewer;

import java.util.ArrayList;

public class CatalogData {
    private static  String[] namaMouse = new String[]{"Logitech G203 Blue", "Logitech G502 Hero White", "Logitech G703 Hero White", "Logitech G304 KDA", "Logitech G305 Lilac", "Logitech G603 Basic", "Logitech G604 Basic", "Logitech G903 Basic"};

    private static int[] gambarMouse = new int[]{R.drawable.mouse_1, R.drawable.mouse_2, R.drawable.mouse_3, R.drawable.mouse_4, R.drawable.mouse_5, R.drawable.mouse_6, R.drawable.mouse_7, R.drawable.mouse_8};

    private static  String[] namaKeyboard = new String[]{"Logitech G413 Silver", "Logitech G513 Carbon", "Logitech GPro KDA", "Logitech G512 Backlit", "Logitech G815 Basic", "Logitech G910 Basic", "Logitech G915 TKL White", "Logitech US PRO"};

    private static int[] gambarKeyboard = new int[]{R.drawable.key_1, R.drawable.key_2, R.drawable.key_3, R.drawable.key_4, R.drawable.key_5, R.drawable.key_6, R.drawable.key_7, R.drawable.key_8};

    private static  String[] namaHeadset = new String[]{"Logitech G233 Prodigy", "Logitech G733 Blue", "Logitech G733 KDA", "Logitech G333 KDA", "Logitech G935 Basic", "Logitech Hypersonic Pro"};

    private static int[] gambarHeadset = new int[]{R.drawable.head_1, R.drawable.head_2, R.drawable.head_3, R.drawable.head_4, R.drawable.head_5, R.drawable.head_6};

    public static ArrayList<MouseCatalogModel> getListDataM(){
        MouseCatalogModel mcatModel = null;
        ArrayList<MouseCatalogModel> listMouse = new ArrayList<MouseCatalogModel>();
        for ( int i = 0; i < namaMouse.length; i++){
            mcatModel = new MouseCatalogModel();
            mcatModel.setGambarItem(gambarMouse[i]);
            mcatModel.setNamaItem(namaMouse[i]);
            listMouse.add(mcatModel);
        }
        return listMouse;
    }

    public static ArrayList<KeyboardCatalogModel> getListDataK(){
        KeyboardCatalogModel kcatModel = null;
        ArrayList<KeyboardCatalogModel> listKeyboard = new ArrayList<KeyboardCatalogModel>();
        for ( int i = 0; i < namaKeyboard.length; i++){
            kcatModel = new KeyboardCatalogModel();
            kcatModel.setGambarItem(gambarKeyboard[i]);
            kcatModel.setNamaItem(namaKeyboard[i]);
            listKeyboard.add(kcatModel);
        }
        return listKeyboard;
    }

    public static ArrayList<HeadsetCatalogModel> getListDataH(){
        HeadsetCatalogModel hcatModel = null;
        ArrayList<HeadsetCatalogModel> listHeadset = new ArrayList<HeadsetCatalogModel>();
        for ( int i = 0; i < namaHeadset.length; i++){
            hcatModel = new HeadsetCatalogModel();
            hcatModel.setGambarItem(gambarHeadset[i]);
            hcatModel.setNamaItem(namaHeadset[i]);
            listHeadset.add(hcatModel);
        }
        return listHeadset;
    }
}
