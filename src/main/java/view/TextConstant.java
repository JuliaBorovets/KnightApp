package main.java.view;

import main.java.controller.Language;
import java.util.ResourceBundle;
import static main.java.view.View.BUNDLE_NAME;

public interface TextConstant {

    ResourceBundle bundle = ResourceBundle.getBundle(BUNDLE_NAME, Language.determineLocale(View.currLanguage));
    String INPUT_STRING_DATA = "input.string.data";
    String INPUT_MIN = bundle.getString("input.string.writeMin");
    String INPUT_MAX = bundle.getString("input.string.writeMax");
    String INPUT_ERROR = "input.string.error";
    String END_GAME = "input.string.end";
    String SIZE_S = bundle.getString("ammunition.size.s");
    String SIZE_M = bundle.getString("ammunition.size.m");
    String SIZE_L = bundle.getString("ammunition.size.l");
    String SWORD1 = bundle.getString("sword.name1");
    String ARMOR1 = bundle.getString("armor.name1");
    String HELMET1 = bundle.getString("helmet.name1");
    String SHIELD1 = bundle.getString("shield.name1");
    String SWORD2 = bundle.getString("sword.name2");
    String ARMOR2 = bundle.getString("armor.name2");
    String HELMET2 = bundle.getString("helmet.name2");
    String SHIELD2 = bundle.getString("shield.name2");
    String SWORD3 = bundle.getString("sword.name3");
    String ARMOR3 = bundle.getString("armor.name3");
    String HELMET3 = bundle.getString("helmet.name3");
    String SHIELD3 = bundle.getString("shield.name3");
    String ARMOR_TYPE_1 = bundle.getString("armor.type1");
    String ARMOR_TYPE_2 = bundle.getString("armor.type2");
    String WEIGHT = bundle.getString("weight");
    String PRICE = bundle.getString("cost");
    String TYPE = bundle.getString("type");
    String SIZE = bundle.getString("size");
    String RESISTANCE = bundle.getString("resistance");
    String IS_CLOSED = bundle.getString("is.closed");
    String TWO_HANDED = bundle.getString("two.handed");
    String TOTAL_PRICE = bundle.getString("total.price");
    String CHOOSE_SIZE = bundle.getString("choose.size");
}
