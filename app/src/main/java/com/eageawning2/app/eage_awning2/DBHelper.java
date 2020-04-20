package com.eageawning2.app.eage_awning2;


import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBHelper extends SQLiteOpenHelper {
    private final String TAG = "MySQLiteOpenHelper";
    static final String DATABASE_NAME = "EdgeAwning";
    static final int VERSION = 1;

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE TABLE production_info ( `series` TEXT, `p_name` TEXT, `option_case` INTEGER, `option1_overlap` INTEGER, `option2_overlap` INTEGER, `unit` INTEGER, PRIMARY KEY(`p_name`) )");
        sqLiteDatabase.execSQL("insert into production_info Values( 'Privee','Aerolux',1,0,0,0)");
        sqLiteDatabase.execSQL("insert into production_info Values( 'Privee','Axis',2,0,0,0)");
        sqLiteDatabase.execSQL("insert into production_info Values( 'Privee','Quattro',3,0,0,0)");
        sqLiteDatabase.execSQL("insert into production_info Values( 'Standard','Novo',4,0,1,1)");
        sqLiteDatabase.execSQL("insert into production_info Values( 'Standard','Radian',5,0,1,1)");
        sqLiteDatabase.execSQL("insert into production_info Values( 'Standard','Luna',6,0,1,1)");
        sqLiteDatabase.execSQL("insert into production_info Values( 'Standard','mn3',7,0,1,1)");
        sqLiteDatabase.execSQL("insert into production_info Values( 'Standard','mn4',8,0,1,1)");
        sqLiteDatabase.execSQL("insert into production_info Values( 'Standard','tw22',9,0,1,1)");
        sqLiteDatabase.execSQL("insert into production_info Values( 'Standard','tw33',10,0,1,1)");

        sqLiteDatabase.execSQL("CREATE TABLE production_width_info( `aerolux` TEXT, `axis` TEXT, `quattro` TEXT, `novo` TEXT, `radian` TEXT, `luna` TEXT, `mn3` TEXT, `mn4` TEXT, `tw22` TEXT, `tw33` TEXT)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(1800,1800,2500,300,300,300,300,300,300,300)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(2000,2000,3000,400,400,400,400,400,400,400)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(2200,2200,3500,450,450,500,450,450,450,450)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(2400,2400,4000,500,500,600,500,500,500,500)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(2600,2600,4500,600,600,700,600,600,600,600)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(2800,2800,5000,700,700,800,700,700,700,700)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(3000,3000,5500,800,800,900,800,800,800,800)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(3200,3200,null,900,900,1000,900,900,900,900)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(3400,3400,null,1000,1000,1100,1000,1000,1000,1000)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(3600,3600,null,1100,1100,1200,1100,1100,1100,1100)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(3800,3800,null,1200,1200,1300,1200,1200,1200,1200)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(4000,4000,null,1300,1300,null,1300,1300,1300,1300)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(null,4200,null,null,null,null,null,null,null,null)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(null,4400,null,null,null,null,null,null,null,null)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(null,4500,null,null,null,null,null,null,null,null)");

        //aerolux
        sqLiteDatabase.execSQL("CREATE TABLE aerolux (`Projection` INTEGER, `1800` REAL, `2000` REAL, `2200` REAL, `2400` REAL, `2600` REAL, `2800` REAL, `3000` REAL, `3200` REAL, `3400` REAL, `3600` REAL, `3800` REAL, `4000` REAL,`option` TEXT )");
        sqLiteDatabase.execSQL("insert into aerolux Values(1569, 6807, 6913, 7019, 7125, 7231, 7338, 7443, 7549, 7655, 7761, 7867, 7973,'standard')");
        sqLiteDatabase.execSQL("insert into aerolux Values(1764, 7010, 7126, 7241, 7354, 7470, 7583, 7698, 7811, 7926, 8041, 8155, 8270,'standard')");
        sqLiteDatabase.execSQL("insert into aerolux Values(1959, 7214, 7338, 7461, 7583, 7707, 7828, 7952, 8075, 8198, 8321, 8443, 8566,'standard')");
        sqLiteDatabase.execSQL("insert into aerolux Values(2154, 7419, 7550, 7682, 7811, 7943, 8075, 8206, 8337, 8468, 8600, 8732, 8862,'standard')");
        sqLiteDatabase.execSQL("insert into aerolux Values(2349, 7622, 7763, 7902, 8042, 8181, 8321, 8460, 8600, 8740, 8879, 9019, 9158,'standard')");
        sqLiteDatabase.execSQL("insert into aerolux Values(2544, 7826, 7975, 8123, 8270, 8418, 8566, 8715, 8862, 9011, 9158, 9307, 9455,'standard')");
        sqLiteDatabase.execSQL("insert into aerolux Values(2739, 8030, 8187, 8343, 8499, 8656, 8812, 8968, 9125, 9281, 9439, 9595, 9752,'standard')");
        sqLiteDatabase.execSQL("insert into aerolux Values(2934, 8233, 8399, 8563, 8728, 8893, 9058, 9223, 9388, 9553, 9718, 9882, 10048,'standard')");
        sqLiteDatabase.execSQL("insert into aerolux Values(3129, 8438, 8611, 8784, 8957, 9132, 9303, 9478, 9651, 9824, 9997, 10170, 10344,'standard')");
        sqLiteDatabase.execSQL("insert into aerolux Values(3324, 8640, 8824, 9006, 9186, 9369, 9550, 9731, 9913, 10095, 10277, 10459, 10641,'standard')");
        sqLiteDatabase.execSQL("insert into aerolux Values(3519, 8845, 9035, 9225, 9416, 9606, 9796, 9986, 10176, 10366, 10557, 10747, 10937,'standard')");
        sqLiteDatabase.execSQL("insert into aerolux Values(3714, 9050, 9247, 9446, 9645, 9842, 10041, 10240, 10438, 10637, 10836, 11034, 11233,'standard')");
        sqLiteDatabase.execSQL("insert into aerolux Values(3909, 9253, 9459, 9667, 9873, 10080, 10287, 10494, 10702, 10908, 11115, 11322, 11529,'standard')");
        sqLiteDatabase.execSQL("insert into aerolux Values(4104, 9457, 9673, 9887, 10103, 10318, 10533, 10748, 10964, 11179, 11395, 11610, 11826,'standard')");
        sqLiteDatabase.execSQL("insert into aerolux Values(4299, 9661, 9884, 10108, 10331, 10555, 10778, 11004, 11227, 11450, 11674, 11897, 12122,'standard')");
        sqLiteDatabase.execSQL("insert into aerolux Values(4494, 9864, 10096, 10329, 10560, 10793, 11025, 11257, 11489, 11722, 11954, 12186, 12418,'standard')");
        sqLiteDatabase.execSQL("insert into aerolux Values(4689, 10069, 10308, 10549, 10791, 11030, 11272, 11511, 11752, 11993, 12233, 12474, 12714,'standard')");
        sqLiteDatabase.execSQL("insert into aerolux Values(4884, 10273, 10521, 10770, 11019, 11267, 11516, 11766, 12014, 12263, 12513, 12762, 13010,'standard')");
        sqLiteDatabase.execSQL("insert into aerolux Values(5079, 10476, 10733, 10989, 11248, 11505, 11762, 12019, 12278, 12535, 12792, 13049, 13307,'standard')");
        sqLiteDatabase.execSQL("insert into aerolux Values(5274, 10680, 10945, 11210, 11477, 11743, 12008, 12274, 12540, 12806, 13071, 13337, 13603,'standard')");
        sqLiteDatabase.execSQL("insert into aerolux Values(5469, 10883, 11158, 11431, 11706, 11980, 12253, 12528, 12802, 13076, 13350, 13625, 13899,'standard')");
        sqLiteDatabase.execSQL("insert into aerolux Values(5664, 11088, 11370, 11651, 11934, 12217, 12500, 12782, 13065, 13348, 13631, 13914, 14196,'standard')");
        sqLiteDatabase.execSQL("insert into aerolux Values(5859, 11292, 11583, 11872, 12163, 12455, 12746, 13037, 13327, 13619, 13910, 14201, 14493,'standard')");
        sqLiteDatabase.execSQL("insert into aerolux Values(6054, 11495, 11796, 12092, 12392, 12692, 12992, 13292, 13589, 13889, 14189, 14489, 14789,'standard')");
        sqLiteDatabase.execSQL("insert into aerolux Values(1569, 1098, 1098, 1098, 1098, 1098, 1098, 1253, 1253, 1253, 1253, 1253, 1253, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into aerolux Values(1764, 1098, 1098, 1098, 1098, 1098, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into aerolux Values(1959, 1098, 1098, 1098, 1098, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into aerolux Values(2154, 1098, 1098, 1098, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into aerolux Values(2349, 1098, 1098, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into aerolux Values(2544, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into aerolux Values(2739, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into aerolux Values(2934, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 1395, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into aerolux Values(3129, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 1395, 1395, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into aerolux Values(3324, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 1395, 1395, 1395, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into aerolux Values(3519, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 1395, 1395, 1395, 1395, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into aerolux Values(3714, 1253, 1253, 1253, 1253, 1253, 1253, 1253, 1395, 1395, 1395, 1395, 1395, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into aerolux Values(3909, 1253, 1253, 1253, 1253, 1253, 1253, 1395, 1395, 1395, 1395, 1395, 1395, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into aerolux Values(4104, 1253, 1253, 1253, 1253, 1253, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into aerolux Values(4299, 1253, 1253, 1253, 1253, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into aerolux Values(4494, 1253, 1253, 1253, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into aerolux Values(4689, 1253, 1253, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into aerolux Values(4884, 1253, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into aerolux Values(5079, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 1525, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into aerolux Values(5274, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 1525, 1525, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into aerolux Values(5469, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 1525, 1525, 1525, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into aerolux Values(5664, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 1525, 1525, 1525, 1525, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into aerolux Values(5859, 1395, 1395, 1395, 1395, 1395, 1395, 1395, 1525, 1525, 1525, 1525, 1525, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into aerolux Values(6054, 1395, 1395, 1395, 1395, 1395, 1395, 1525, 1525, 1525, 1525, 1525, 1525, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into aerolux Values(1569,1228,1228,1228,1228,1228,1228,1424,1424,1424,1424,1424,1424, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into aerolux Values(1764,1228,1228,1228,1228,1228,1424,1424,1424,1424,1424,1424,1424, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into aerolux Values(1959,1228,1228,1228,1228,1424,1424,1424,1424,1424,1424,1424,1424, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into aerolux Values(2154,1228,1228,1228,1424,1424,1424,1424,1424,1424,1424,1424,1424, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into aerolux Values(2349,1228,1228,1424,1424,1424,1424,1424,1424,1424,1424,1424,1424, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into aerolux Values(2544,1424,1424,1424,1424,1424,1424,1424,1424,1424,1424,1424,1424, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into aerolux Values(2739,1424,1424,1424,1424,1424,1424,1424,1424,1424,1424,1424,1424, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into aerolux Values(2934,1424,1424,1424,1424,1424,1424,1424,1424,1424,1424,1424,1615, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into aerolux Values(3129,1424,1424,1424,1424,1424,1424,1424,1424,1424,1424,1615,1615, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into aerolux Values(3324,1424,1424,1424,1424,1424,1424,1424,1424,1424,1615,1615,1615, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into aerolux Values(3519,1424,1424,1424,1424,1424,1424,1424,1424,1615,1615,1615,1615, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into aerolux Values(3714,1424,1424,1424,1424,1424,1424,1424,1615,1615,1615,1615,1615, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into aerolux Values(3909,1424,1424,1424,1424,1424,1424,1615,1615,1615,1615,1615,1615, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into aerolux Values(4104,1424,1424,1424,1424,1424,1615,1615,1615,1615,1615,1615,1615, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into aerolux Values(4299,1424,1424,1424,1424,1615,1615,1615,1615,1615,1615,1615,1615, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into aerolux Values(4494,1424,1424,1424,1615,1615,1615,1615,1615,1615,1615,1615,1615, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into aerolux Values(4689,1424,1424,1615,1615,1615,1615,1615,1615,1615,1615,1615,1615, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into aerolux Values(4884,1424,1615,1615,1615,1615,1615,1615,1615,1615,1615,1615,1615, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into aerolux Values(5079,1615,1615,1615,1615,1615,1615,1615,1615,1615,1615,1615,1783, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into aerolux Values(5274,1615,1615,1615,1615,1615,1615,1615,1615,1615,1615,1783,1783, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into aerolux Values(5469,1615,1615,1615,1615,1615,1615,1615,1615,1615,1783,1783,1783, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into aerolux Values(5664,1615,1615,1615,1615,1615,1615,1615,1615,1783,1783,1783,1783, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into aerolux Values(5859,1615,1615,1615,1615,1615,1615,1615,1783,1783,1783,1783,1783, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into aerolux Values(6054,1615,1615,1615,1615,1615,1615,1783,1783,1783,1783,1783,1783, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into aerolux Values(1569, 139, 147, 154, 162, 170, 178, 186, 194, 202, 209, 217, 225, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into aerolux Values(1764, 150, 160, 169, 178, 187, 196, 205, 215, 224, 233, 242, 251, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into aerolux Values(1959, 162, 173, 183, 194, 204, 215, 225, 236, 246, 256, 267, 277, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into aerolux Values(2154, 174, 186, 198, 209, 221, 233, 245, 256, 268, 280, 292, 304, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into aerolux Values(2349, 186, 199, 212, 225, 238, 251, 264, 277, 291, 304, 317, 330, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into aerolux Values(2544, 198, 212, 226, 241, 255, 270, 284, 298, 313, 327, 342, 356, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into aerolux Values(2739, 209, 225, 241, 256, 272, 288, 304, 319, 335, 351, 366, 382, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into aerolux Values(2934, 221, 238, 255, 272, 289, 306, 323, 340, 357, 374, 391, 408, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into aerolux Values(3129, 233, 251, 270, 288, 306, 325, 343, 361, 380, 398, 416, 435, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into aerolux Values(3324, 245, 264, 284, 304, 323, 343, 363, 382, 402, 421, 441, 461, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into aerolux Values(3519, 256, 277, 298, 319, 340, 361, 382, 403, 424, 445, 466, 487, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into aerolux Values(3714, 268, 291, 313, 335, 357, 380, 402, 424, 446, 469, 491, 513, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into aerolux Values(3909, 280, 304, 327, 351, 374, 398, 421, 445, 469, 492, 516, 539, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into aerolux Values(4104, 292, 317, 342, 366, 391, 416, 441, 466, 491, 516, 541, 565, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into aerolux Values(4299, 304, 330, 356, 382, 408, 435, 461, 487, 513, 539, 565, 592, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into aerolux Values(4494, 315, 343, 370, 398, 425, 453, 480, 508, 535, 563, 590, 618, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into aerolux Values(4689, 327, 356, 385, 414, 442, 471, 500, 529, 558, 586, 615, 644, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into aerolux Values(4884, 339, 369, 399, 429, 459, 489, 520, 550, 580, 610, 640, 670, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into aerolux Values(5079, 351, 382, 414, 445, 476, 508, 539, 571, 602, 633, 665, 696, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into aerolux Values(5274, 363, 395, 428, 461, 493, 526, 559, 592, 624, 657, 690, 723, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into aerolux Values(5469, 374, 408, 442, 476, 510, 544, 579, 613, 647, 681, 715, 749, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into aerolux Values(5664, 386, 421, 457, 492, 527, 563, 598, 633, 669, 704, 740, 775, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into aerolux Values(5859, 398, 435, 471, 508, 544, 581, 618, 654, 691, 728, 764, 801, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into aerolux Values(6054, 410, 448, 486, 524, 561, 599, 637, 675, 713, 751, 789, 827, 'Insulation Foam')");


        sqLiteDatabase.execSQL("CREATE TABLE axis ( `Projection` INTEGER, `1800` REAL, `2000` REAL, `2200` REAL, `2400` REAL, `2600` REAL, `2800` REAL, `3000` REAL, `3200` REAL, `3400` REAL, `3600` REAL, `3800` REAL, `4000` REAL,`4200`REAL,`4400` REAL,`4500` REAL,`option` TEXT )");
        sqLiteDatabase.execSQL("insert into axis Values(1474, 4999, 5082, 5166, 5250, 5334, 5417, 5501, 5585, 5669, 5752, 5836, 5920, 6819, 6902, 6944, 'standard')");
        sqLiteDatabase.execSQL("insert into axis Values(1682, 5141, 5232, 5322, 5413, 5503, 5594, 5684, 5775, 5865, 5956, 6046, 6137, 7043, 7133, 7178, 'standard')");
        sqLiteDatabase.execSQL("insert into axis Values(1890, 5284, 5381, 5478, 5576, 5673, 5770, 5867, 5965, 6062, 6159, 6257, 6354, 7266, 7364, 7412, 'standard')");
        sqLiteDatabase.execSQL("insert into axis Values(2098, 5426, 5530, 5634, 5738, 5842, 5946, 6051, 6155, 6259, 6363, 6467, 6571, 7490, 7594, 7646, 'standard')");
        sqLiteDatabase.execSQL("insert into axis Values(2306, 5569, 5679, 5790, 5901, 6012, 6123, 6234, 6345, 6455, 6566, 6677, 6788, 7714, 7825, 7880, 'standard')");
        sqLiteDatabase.execSQL("insert into axis Values(2514, 5711, 5829, 5946, 6064, 6182, 6299, 6417, 6535, 6652, 6770, 6887, 7005, 7938, 8056, 8114, 'standard')");
        sqLiteDatabase.execSQL("insert into axis Values(2722, 5854, 5978, 6102, 6227, 6351, 6476, 6600, 6724, 6849, 6973, 7098, 7222, 8162, 8286, 8348, 'standard')");
        sqLiteDatabase.execSQL("insert into axis Values(2930, 5996, 6127, 6258, 6390, 6521, 6652, 6783, 6914, 7046, 7177, 7308, 7439, 8386, 8517, 8582, 'standard')");
        sqLiteDatabase.execSQL("insert into axis Values(3138, 6139, 6277, 6415, 6552, 6690, 6828, 6966, 7104, 7242, 7380, 7518, 7656, 8610, 8747, 8816, 'standard')");
        sqLiteDatabase.execSQL("insert into axis Values(3346, 6281, 6426, 6571, 6715, 6860, 7005, 7150, 7294, 7439, 7584, 7729, 7873, 8833, 8978, 9051, 'standard')");
        sqLiteDatabase.execSQL("insert into axis Values(3554, 6424, 6575, 6727, 6878, 7030, 7181, 7333, 7484, 7636, 7787, 7939, 8090, 9057, 9209, 9285, 'standard')");
        sqLiteDatabase.execSQL("insert into axis Values(3762, 6566, 6724, 6883, 7041, 7199, 7358, 7516, 7674, 7833, 7991, 8149, 8308, 9281, 9439, 9519, 'standard')");
        sqLiteDatabase.execSQL("insert into axis Values(3970, 6708, 6874, 7039, 7204, 7369, 7534, 7699, 7864, 8029, 8194, 8359, 8525, 9505, 9670, 9753, 'standard')");
        sqLiteDatabase.execSQL("insert into axis Values(4178, 6851, 7023, 7195, 7367, 7539, 7710, 7882, 8054, 8226, 8398, 8570, 8742, 9729, 9901, 9987, 'standard')");
        sqLiteDatabase.execSQL("insert into axis Values(4386, 6993, 7172, 7351, 7529, 7708, 7887, 8065, 8244, 8423, 8601, 8780, 8959, 9953, 10131, 10221, 'standard')");
        sqLiteDatabase.execSQL("insert into axis Values(4594, 7136, 7321, 7507, 7692, 7878, 8063, 8249, 8434, 8619, 8805, 8990, 9176, 10176, 10362, 10455, 'standard')");
        sqLiteDatabase.execSQL("insert into axis Values(4802, 7278, 7471, 7663, 7855, 8047, 8240, 8432, 8624, 8816, 9008, 9201, 9393, 10400, 10593, 10689, 'standard')");
        sqLiteDatabase.execSQL("insert into axis Values(5010, 7421, 7620, 7819, 8018, 8217, 8416, 8615, 8814, 9013, 9212, 9411, 9610, 10624, 10823, 10923, 'standard')");
        sqLiteDatabase.execSQL("insert into axis Values(5218, 8379, 8584, 8790, 8996, 9202, 9408, 9613, 9819, 10025, 10231, 10436, 10642, 10848, 11054, 11157, 'standard')");
        sqLiteDatabase.execSQL("insert into axis Values(5426, 8521, 8734, 8946, 9159, 9371, 9584, 9797, 10009, 10222, 10434, 10647, 10859, 11072, 11284, 11391, 'standard')");
        sqLiteDatabase.execSQL("insert into axis Values(5634, 8664, 8883, 9102, 9322, 9541, 9760, 9980, 10199, 10418, 10638, 10857, 11076, 11296, 11515, 11625, 'standard')");
        sqLiteDatabase.execSQL("insert into axis Values(5842, 8806, 9032, 9258, 9484, 9711, 9937, 10163, 10389, 10615, 10841, 11067, 11293, 11520, 11746, 11859, 'standard')");
        sqLiteDatabase.execSQL("insert into axis Values(6050, 8949, 9181, 9414, 9647, 9880, 10113, 10346, 10579, 10812, 11045, 11278, 11511, 11743, 11976, 12093, 'standard')");
        sqLiteDatabase.execSQL("insert into axis Values(6258, 9091, 9331, 9570, 9810, 10050, 10289, 10529, 10769, 11009, 11248, 11488, 11728, 11967, 12207, 12327, 'standard')");
        sqLiteDatabase.execSQL("insert into axis Values(6466, 9234, 9480, 9726, 9973, 10219, 10466, 10712, 10959, 11205, 11452, 11698, 11945, 12191, 12438, 12561, 'standard')");
        sqLiteDatabase.execSQL("insert into axis Values(6674, 9376, 9629, 9883, 10136, 10389, 10642, 10896, 11149, 11402, 11655, 11908, 12162, 12415, 12668, 12795, 'standard')");
        sqLiteDatabase.execSQL("insert into axis Values(6882, 10109, 10369, 10629, 10889, 11149, 11409, 11669, 11929, 12189, 12449, 12709, 12969, 13229, 13489, 13619, 'standard')");
        sqLiteDatabase.execSQL("insert into axis Values(7090, 10251, 10518, 10785, 11051, 11318, 11585, 11852, 12119, 12385, 12652, 12919, 13186, 13453, 13720, 13853, 'standard')");
        sqLiteDatabase.execSQL("insert into axis Values(7298, 10394, 10667, 10941, 11214, 11488, 11761, 12035, 12309, 12582, 12856, 13129, 13403, 13677, 13950, 14087, 'standard')");
        sqLiteDatabase.execSQL("insert into axis Values(7506, 10536, 10816, 11097, 11377, 11657, 11938, 12218, 12499, 12779, 13059, 13340, 13620, 13900, 14181, 14321, 'standard')");
        sqLiteDatabase.execSQL("insert into axis Values(7714, 10678, 10966, 11253, 11540, 11827, 12114, 12401, 12689, 12976, 13263, 13550, 13837, 14124, 14411, 14555, 'standard')");
        sqLiteDatabase.execSQL("insert into axis Values(7922, 10821, 11115, 11409, 11703, 11997, 12291, 12585, 12878, 13172, 13466, 13760, 14054, 14348, 14642, 14789, 'standard')");
        sqLiteDatabase.execSQL("insert into axis Values(1474, 1153, 1153, 1153, 1153, 1153, 1153, 1316, 1316, 1316, 1316, 1316, 1316, 1465, 1465, 1465, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into axis Values(1682, 1153, 1153, 1153, 1153, 1153, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1465, 1465, 1465, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into axis Values(1890, 1153, 1153, 1153, 1153, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1465, 1465, 1465, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into axis Values(2098, 1153, 1153, 1153, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1465, 1465, 1465, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into axis Values(2306, 1153, 1153, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1465, 1465, 1465, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into axis Values(2514, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1465, 1465, 1465, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into axis Values(2722, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1465, 1465, 1465, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into axis Values(2930, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1465, 1465, 1465, 1465, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into axis Values(3138, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1465, 1465, 1465, 1465, 1465, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into axis Values(3346, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1465, 1465, 1465, 1465, 1465, 1465, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into axis Values(3554, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into axis Values(3762, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into axis Values(3970, 1316, 1316, 1316, 1316, 1316, 1316, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into axis Values(4178, 1316, 1316, 1316, 1316, 1316, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into axis Values(4386, 1316, 1316, 1316, 1316, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1601, 1601, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into axis Values(4594, 1316, 1316, 1316, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1601, 1601, 1601, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into axis Values(4802, 1316, 1316, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1601, 1601, 1601, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into axis Values(5010, 1316, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1601, 1601, 1601, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into axis Values(5218, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1601, 1601, 1601, 1601, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into axis Values(5426, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1601, 1601, 1601, 1601, 1601, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into axis Values(5634, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1601, 1601, 1601, 1601, 1601, 1601, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into axis Values(5842, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into axis Values(6050, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into axis Values(6258, 1465, 1465, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into axis Values(6466, 1465, 1465, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into axis Values(6674, 1465, 1465, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into axis Values(6882, 1465, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1778, 1778, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into axis Values(7090, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1778, 1778, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into axis Values(7298, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1778, 1778, 1778, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into axis Values(7506, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1778, 1778, 1778, 1778, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into axis Values(7714, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1778, 1778, 1778, 1778, 1778, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into axis Values(7922, 1681, 1681, 1681, 1681, 1681, 1681, 1681, 1681, 1681, 1681, 1867, 1867, 1867, 1867, 1867, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into axis Values(1474, 1277, 1277, 1277, 1277, 1277, 1277, 1481, 1481, 1481, 1481, 1481, 1481, 1680, 1680, 1680, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into axis Values(1682, 1277, 1277, 1277, 1277, 1277, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1680, 1680, 1680, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into axis Values(1890, 1277, 1277, 1277, 1277, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1680, 1680, 1680, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into axis Values(2098, 1277, 1277, 1277, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1680, 1680, 1680, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into axis Values(2306, 1277, 1277, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1680, 1680, 1680, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into axis Values(2514, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1680, 1680, 1680, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into axis Values(2722, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1680, 1680, 1680, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into axis Values(2930, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1680, 1680, 1680, 1680, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into axis Values(3138, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1680, 1680, 1680, 1680, 1680, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into axis Values(3346, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1680, 1680, 1680, 1680, 1680, 1680, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into axis Values(3554, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into axis Values(3762, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into axis Values(3970, 1481, 1481, 1481, 1481, 1481, 1481, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into axis Values(4178, 1481, 1481, 1481, 1481, 1481, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into axis Values(4386, 1481, 1481, 1481, 1481, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1854, 1854, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into axis Values(4594, 1481, 1481, 1481, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1854, 1854, 1854, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into axis Values(4802, 1481, 1481, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1854, 1854, 1854, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into axis Values(5010, 1481, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1854, 1854, 1854, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into axis Values(5218, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1854, 1854, 1854, 1854, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into axis Values(5426, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1854, 1854, 1854, 1854, 1854, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into axis Values(5634, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1854, 1854, 1854, 1854, 1854, 1854, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into axis Values(5842, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into axis Values(6050, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into axis Values(6258, 1680, 1680, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into axis Values(6466, 1680, 1680, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into axis Values(6674, 1680, 1680, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into axis Values(6882, 1680, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 2076, 2076, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into axis Values(7090, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 2076, 2076, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into axis Values(7298, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 2076, 2076, 2076, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into axis Values(7506, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 2076, 2076, 2076, 2076, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into axis Values(7714, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 2076, 2076, 2076, 2076, 2076, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into axis Values(7922, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 2076, 2076, 2076, 2076, 2076, 2076, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into axis Values(1474, 139, 147, 154, 162, 170, 178, 186, 194, 202, 209, 217, 225, 233, 241, 245, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into axis Values(1682, 150, 160, 169, 178, 187, 196, 205, 215, 224, 233, 242, 251, 260, 270, 274, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into axis Values(1890, 162, 173, 183, 194, 204, 215, 225, 236, 246, 256, 267, 277, 288, 298, 304, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into axis Values(2098, 174, 186, 198, 209, 221, 233, 245, 256, 268, 280, 292, 304, 315, 327, 333, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into axis Values(2306, 186, 199, 212, 225, 238, 251, 264, 277, 291, 304, 317, 330, 343, 356, 363, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into axis Values(2514, 198, 212, 226, 241, 255, 270, 284, 298, 313, 327, 342, 356, 370, 385, 392, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into axis Values(2722, 209, 225, 241, 256, 272, 288, 304, 319, 335, 351, 366, 382, 398, 414, 421, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into axis Values(2930, 221, 238, 255, 272, 289, 306, 323, 340, 357, 374, 391, 408, 425, 442, 451, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into axis Values(3138, 233, 251, 270, 288, 306, 325, 343, 361, 380, 398, 416, 435, 453, 471, 480, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into axis Values(3346, 245, 264, 284, 304, 323, 343, 363, 382, 402, 421, 441, 461, 480, 500, 510, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into axis Values(3554, 256, 277, 298, 319, 340, 361, 382, 403, 424, 445, 466, 487, 508, 529, 539, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into axis Values(3762, 268, 291, 313, 335, 357, 380, 402, 424, 446, 469, 491, 513, 535, 558, 569, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into axis Values(3970, 280, 304, 327, 351, 374, 398, 421, 445, 469, 492, 516, 539, 563, 586, 598, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into axis Values(4178, 292, 317, 342, 366, 391, 416, 441, 466, 491, 516, 541, 565, 590, 615, 628, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into axis Values(4386, 304, 330, 356, 382, 408, 435, 461, 487, 513, 539, 565, 592, 618, 644, 657, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into axis Values(4594, 315, 343, 370, 398, 425, 453, 480, 508, 535, 563, 590, 618, 645, 673, 687, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into axis Values(4802, 327, 356, 385, 414, 442, 471, 500, 529, 558, 586, 615, 644, 673, 702, 716, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into axis Values(5010, 339, 369, 399, 429, 459, 489, 520, 550, 580, 610, 640, 670, 700, 730, 745, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into axis Values(5218, 351, 382, 414, 445, 476, 508, 539, 571, 602, 633, 665, 696, 728, 759, 775, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into axis Values(5426, 363, 395, 428, 461, 493, 526, 559, 592, 624, 657, 690, 723, 755, 788, 804, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into axis Values(5634, 374, 408, 442, 476, 510, 544, 579, 613, 647, 681, 715, 749, 783, 817, 834, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into axis Values(5842, 386, 421, 457, 492, 527, 563, 598, 633, 669, 704, 740, 775, 810, 846, 863, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into axis Values(6050, 398, 435, 471, 508, 544, 581, 618, 654, 691, 728, 764, 801, 838, 874, 893, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into axis Values(6258, 410, 448, 486, 524, 561, 599, 637, 675, 713, 751, 789, 827, 865, 903, 922, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into axis Values(6466, 421, 461, 500, 539, 579, 618, 657, 696, 736, 775, 814, 853, 893, 932, 952, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into axis Values(6674, 433, 474, 514, 555, 596, 636, 677, 717, 758, 798, 839, 880, 920, 961, 981, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into axis Values(6882, 445, 487, 529, 571, 613, 654, 696, 738, 780, 822, 864, 906, 948, 990, 1010, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into axis Values(7090, 457, 500, 543, 586, 630, 673, 716, 759, 802, 846, 889, 932, 975, 1018, 1040, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into axis Values(7298, 469, 513, 558, 602, 647, 691, 736, 780, 825, 869, 914, 958, 1003, 1047, 1069, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into axis Values(7506, 480, 526, 572, 618, 664, 709, 755, 801, 847, 893, 938, 984, 1030, 1076, 1099, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into axis Values(7714, 492, 539, 586, 633, 681, 728, 775, 822, 869, 916, 963, 1010, 1058, 1105, 1128, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into axis Values(7922, 504, 552, 601, 649, 698, 746, 794, 843, 891, 940, 988, 1037, 1085, 1134, 1158, 'Insulation Foam')");

        sqLiteDatabase.execSQL("CREATE TABLE quattro ( `Projection` INTEGER, `2500` REAL, `3000` REAL, `3500` REAL, `4000` REAL, `4500` REAL, `5000` REAL, `5500` REAL,`option` TEXT )");
        sqLiteDatabase.execSQL("insert into quattro Values(1500, 6078, 6354, 6631, 6908, 7187, 7464, 7741, 'standard')");
        sqLiteDatabase.execSQL("insert into quattro Values(2000, 6437, 6741, 7045, 7349, 7655, 7959, 8263, 'standard')");
        sqLiteDatabase.execSQL("insert into quattro Values(2500, 6829, 7161, 7492, 7824, 8157, 8489, 8820, 'standard')");
        sqLiteDatabase.execSQL("insert into quattro Values(3000, 7188, 7547, 7906, 8265, 8625, 8984, 9343, 'standard')");
        sqLiteDatabase.execSQL("insert into quattro Values(3500, 7548, 7934, 8320, 8706, 9093, 9479, 9865, 'standard')");
        sqLiteDatabase.execSQL("insert into quattro Values(4000, 7907, 8320, 8734, 9147, 9560, 9974, 10387, 'standard')");
        sqLiteDatabase.execSQL("insert into quattro Values(4500, 8299, 8740, 9181, 9622, 10062, 10503, 10944, 'standard')");
        sqLiteDatabase.execSQL("insert into quattro Values(5000, 8658, 9126, 9595, 10063, 10530, 10998, 11467, 'standard')");
        sqLiteDatabase.execSQL("insert into quattro Values(5500, 9019, 9514, 10009, 10504, 11005, 11493, 11982, 'standard')");
        sqLiteDatabase.execSQL("insert into quattro Values(6000, 9379, 9901, 10422, 10944, 11479, 11989, 12498, 'standard')");
        sqLiteDatabase.execSQL("insert into quattro Values(6500, 9771, 10320, 10870, 11419, 11975, 12518, 13061, 'standard')");
        sqLiteDatabase.execSQL("insert into quattro Values(7000, 10131, 10707, 11284, 11860, 12437, 13013, 13590, 'standard')");
        sqLiteDatabase.execSQL("insert into quattro Values(7500, 10490, 11094, 11697, 12301, 12904, 13508, 14112, 'standard')");
        sqLiteDatabase.execSQL("insert into quattro Values(8000, 10849, 11480, 12111, 12742, 13372, 14003, 14634, 'standard')");
        sqLiteDatabase.execSQL("insert into quattro Values(1500,1098,1253,1253,1253,1395,1395,1395,'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into quattro Values(2000,1253,1253,1253,1253,1395,1395,1395,'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into quattro Values(2500,1253,1253,1253,1253,1395,1395,1395,'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into quattro Values(3000,1253,1253,1253,1395,1395,1395,1395,'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into quattro Values(3500,1253,1253,1395,1395,1395,1395,1525,'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into quattro Values(4000,1253,1395,1395,1395,1395,1525,1525,'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into quattro Values(4500,1395,1395,1395,1395,1525,1525,1525,'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into quattro Values(5000,1395,1395,1395,1395,1525,1525,1525,'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into quattro Values(5500,1395,1395,1525,1525,1525,1525,1525,'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into quattro Values(6000,1395,1395,1525,1525,1525,1525,1693,'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into quattro Values(6500,1525,1525,1525,1525,1525,1693,1693,'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into quattro Values(7000,1525,1525,1525,1525,1693,1693,1693,'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into quattro Values(7500,1525,1525,1525,1693,1693,1693,1693,'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into quattro Values(8000,1525,1525,1693,1693,1693,1693,1693,'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into quattro Values(1500, 1228, 1424, 1424, 1424, 1615, 1615, 1615, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into quattro Values(2000, 1424, 1424, 1424, 1424, 1615, 1615, 1615, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into quattro Values(2500, 1424, 1424, 1424, 1424, 1615, 1615, 1615, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into quattro Values(3000, 1424, 1424, 1424, 1615, 1615, 1615, 1615, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into quattro Values(3500, 1424, 1424, 1615, 1615, 1615, 1615, 1783, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into quattro Values(4000, 1424, 1615, 1615, 1615, 1615, 1783, 1783, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into quattro Values(4500, 1615, 1615, 1615, 1615, 1783, 1783, 1783, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into quattro Values(5000, 1615, 1615, 1615, 1615, 1783, 1783, 1783, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into quattro Values(5500, 1615, 1615, 1783, 1783, 1783, 1783, 1783, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into quattro Values(6000, 1615, 1615, 1783, 1783, 1783, 1783, 1996, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into quattro Values(6500, 1783, 1783, 1783, 1783, 1783, 1996, 1996, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into quattro Values(7000, 1783, 1783, 1783, 1783, 1996, 1996, 1996, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into quattro Values(7500, 1783, 1783, 1783, 1996, 1996, 1996, 1996, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into quattro Values(8000, 1783, 1783, 1996, 1996, 1996, 1996, 1996, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into quattro Values(1500, 530, 555, 581, 607, 633, 659, 685, 'Linear Fabric Dimmer Led Lighting')");
        sqLiteDatabase.execSQL("insert into quattro Values(2000, 606, 640, 674, 709, 743, 778, 812, 'Linear Fabric Dimmer Led Lighting')");
        sqLiteDatabase.execSQL("insert into quattro Values(2500, 682, 725, 768, 811, 854, 897, 940, 'Linear Fabric Dimmer Led Lighting')");
        sqLiteDatabase.execSQL("insert into quattro Values(3000, 757, 809, 861, 912, 964, 1016, 1067, 'Linear Fabric Dimmer Led Lighting')");
        sqLiteDatabase.execSQL("insert into quattro Values(3500, 833, 894, 954, 1014, 1074, 1134, 1195, 'Linear Fabric Dimmer Led Lighting')");
        sqLiteDatabase.execSQL("insert into quattro Values(4000, 909, 978, 1047, 1116, 1185, 1253, 1322, 'Linear Fabric Dimmer Led Lighting')");
        sqLiteDatabase.execSQL("insert into quattro Values(4500, 985, 1063, 1140, 1218, 1295, 1372, 1450, 'Linear Fabric Dimmer Led Lighting')");
        sqLiteDatabase.execSQL("insert into quattro Values(5000, 1061, 1147, 1233, 1319, 1405, 1491, 1577, 'Linear Fabric Dimmer Led Lighting')");
        sqLiteDatabase.execSQL("insert into quattro Values(5500, 1137, 1232, 1327, 1421, 1516, 1610, 1705, 'Linear Fabric Dimmer Led Lighting')");
        sqLiteDatabase.execSQL("insert into quattro Values(6000, 1213, 1316, 1420, 1523, 1626, 1729, 1832, 'Linear Fabric Dimmer Led Lighting')");
        sqLiteDatabase.execSQL("insert into quattro Values(6500, 1289, 1401, 1513, 1625, 1736, 1848, 1960, 'Linear Fabric Dimmer Led Lighting')");
        sqLiteDatabase.execSQL("insert into quattro Values(7000, 1365, 1485, 1606, 1726, 1847, 1967, 2088, 'Linear Fabric Dimmer Led Lighting')");
        sqLiteDatabase.execSQL("insert into quattro Values(7500, 1441, 1570, 1699, 1828, 1957, 2086, 2215, 'Linear Fabric Dimmer Led Lighting')");
        sqLiteDatabase.execSQL("insert into quattro Values(8000, 1517, 1655, 1792, 1930, 2067, 2205, 2343, 'Linear Fabric Dimmer Led Lighting')");


        sqLiteDatabase.execSQL("CREATE TABLE novo ( `Projection` INTEGER, `300` REAL, `400` REAL, `450` REAL, `500` REAL, `600` REAL, `700` REAL, `800` REAL, `900` REAL, `1000` REAL, `1100` REAL, `1200` REAL, `1300` REAL,`option` TEXT )");
        sqLiteDatabase.execSQL("insert into novo Values(300, 3230, 3593, 3772, 4419, 4700, 5058, 5419, 5776, 6587, 6995, 7258, 7659, 'standard')");
        sqLiteDatabase.execSQL("insert into novo Values(400, 3567, 3999, 4214, 4966, 5307, 5736, 6168, 6595, 7543, 8029, 8349, 8827,'standard')");
        sqLiteDatabase.execSQL("insert into novo Values(500, 3903, 4406, 4657, 5514, 5913, 6413, 6916, 7414, 8498, 9063, 9440, 9995,'standard')");
        sqLiteDatabase.execSQL("insert into novo Values(600, 4238, 4814, 5099, 6061, 6520, 7091, 7665, 8234, 9453, 10097, 10531, 11163,'standard')");
        sqLiteDatabase.execSQL("insert into novo Values(700, 4574, 5221, 5540, 6608, 7127, 7768, 8414, 9053, 10409, 11132, 11621, 12331,'standard')");
        sqLiteDatabase.execSQL("insert into novo Values(800, 5730, 6520, 6911, 8425, 9065, 9850, 10640, 11421, 14051, 14928, 15542, 16403, 'standard')");
        sqLiteDatabase.execSQL("insert into novo Values(900, 6225, 7115, 7555, 10013, 10723, 11607, 12497, 13376, 15453, 16447, 17126, 18101, 'standard')");
        sqLiteDatabase.execSQL("insert into novo Values(1000, 6656, 7625, 8104, 10707, 11485, 12448, 13417, 14375, 16631, 17713, 18456, 19517, 'standard')");
        sqLiteDatabase.execSQL("insert into novo Values(300, 3735, 4133, 4329, 5094, 5411, 5804, 6200, 6592, 7540, 7981, 8281, 8716,'HDD')");
        sqLiteDatabase.execSQL("insert into novo Values(400, 4153, 4631, 4870, 5745, 6133, 6610, 7087, 7561, 8656, 9190, 9555, 10081,'HDD')");
        sqLiteDatabase.execSQL("insert into novo Values(500, 4568, 5129, 5410, 6396, 6854, 7412, 7974, 8530, 9773, 10397, 10831, 11445,'HDD')");
        sqLiteDatabase.execSQL("insert into novo Values(600, 5018, 5664, 5984, 7081, 7610, 8251, 8896, 9534, 10924, 11638, 12142, 12844,'HDD')");
        sqLiteDatabase.execSQL("insert into novo Values(700, 5434, 6162, 6523, 7732, 8332, 9055, 9783, 10503, 12042, 12846, 13418, 14209,'HDD')");
        sqLiteDatabase.execSQL("insert into novo Values(800, 6669, 7553, 7992, 9652, 10385, 11264, 12147, 13021, 15846, 16815, 17521, 18476,'HDD')");
        sqLiteDatabase.execSQL("insert into novo Values(900, 7245, 8239, 8732, 11343, 12159, 13147, 14142, 15126, 17408, 18507, 19290, 20371,'HDD')");
        sqLiteDatabase.execSQL("insert into novo Values(1000, 7755, 8840, 9379, 12140, 13035, 14114, 15199, 16273, 18748, 19946, 20805, 21983,'HDD')");
        sqLiteDatabase.execSQL("insert into novo Values(null,142, 180, 198, 276, 283, 322, 360, 399, 483, 539, 568, 597 ,'Aerofoil Louvre')");

        sqLiteDatabase.execSQL("CREATE TABLE radian ( `Projection` INTEGER, `300` REAL, `400` REAL, `450` REAL, `500` REAL, `600` REAL, `700` REAL, `800` REAL, `900` REAL, `1000` REAL, `1100` REAL, `1200` REAL, `1300` REAL,`option` TEXT )");
        sqLiteDatabase.execSQL("insert into radian Values(300, 4520, 4957, 5174, 5987, 6333, 6768, 7205, 7637, 9405, 9895, 10229, 10711, 'standard')");
        sqLiteDatabase.execSQL("insert into radian Values(400, 4963, 5493, 5757, 6708, 7135, 7662, 8193, 8718, 10666, 11257, 11669, 12250, 'standard')");
        sqLiteDatabase.execSQL("insert into radian Values(500, 5404, 6030, 6339, 7429, 7936, 8556, 9180, 9798, 11926, 12619, 13108, 13789, 'standard')");
        sqLiteDatabase.execSQL("insert into radian Values(600, 5847, 6565, 6921, 8150, 8737, 9451, 10168, 10878, 13185, 13979, 14548, 15328, 'standard')");
        sqLiteDatabase.execSQL("insert into radian Values(700, 6290, 7101, 7504, 8870, 9539, 10345, 11156, 11958, 14446, 15340, 15988, 16867, 'standard')");
        sqLiteDatabase.execSQL("insert into radian Values(800, 7619, 8530, 8982, 10828, 11573, 12477, 13389, 14289, 17299, 18303, 19029, 20017, 'standard')");
        sqLiteDatabase.execSQL("insert into radian Values(900, 8959, 9990, 10501, 12543, 13371, 14392, 15420, 16436, 18922, 20056, 20862, 21978, 'standard')");
        sqLiteDatabase.execSQL("insert into radian Values(1000, 9472, 10596, 11153, 13368, 14277, 15390, 16512, 17621, 20321, 21557, 22442, 23658, 'standard')");
        sqLiteDatabase.execSQL("insert into radian Values(1100, 9984, 11201, 11805, 14194, 15182, 16389, 17604, 18806, 21720, 23058, 24021, 25336, 'standard')");
        sqLiteDatabase.execSQL("insert into radian Values(300, 5024, 5498, 5731, 6663, 7044, 7514, 7986, 8453, 10358, 10882, 11252, 11768,'HDD')");
        sqLiteDatabase.execSQL("insert into radian Values(400, 5549, 6124, 6413, 7488, 7961, 8536, 9112, 9684, 11779, 12418, 12875, 13503,'HDD')");
        sqLiteDatabase.execSQL("insert into radian Values(500, 6070, 6753, 7092, 8312, 8877, 9555, 10238, 10915, 13202, 13952, 14499, 15239,'HDD')");
        sqLiteDatabase.execSQL("insert into radian Values(600, 6627, 7415, 7806, 9171, 9827, 10612, 11399, 12178, 14656, 15520, 16159, 17009,'HDD')");
        sqLiteDatabase.execSQL("insert into radian Values(700, 7150, 8042, 8486, 9994, 10744, 11632, 12525, 13409, 16078, 17054, 17784, 18744,'HDD')");
        sqLiteDatabase.execSQL("insert into radian Values(800, 8558, 9564, 10062, 12055, 12894, 13892, 14896, 15890, 19093, 20190, 21009, 22090,'HDD')");
        sqLiteDatabase.execSQL("insert into radian Values(900, 9979, 11114, 11678, 13874, 14807, 15932, 17065, 18186, 20877, 22116, 23026, 24248,'HDD')");
        sqLiteDatabase.execSQL("insert into radian Values(1000, 10571, 11811, 12428, 14801, 15827, 17057, 18294, 19520, 22438, 23790, 24791, 26124,'HDD')");
        sqLiteDatabase.execSQL("insert into radian Values(1100, 11083, 12417, 13080, 15627, 16732, 18056, 19386, 20704, 23836, 25291, 26370, 27802,'HDD')");
        sqLiteDatabase.execSQL("insert into radian Values(null,142, 180, 198, 276, 283, 322, 360, 399, 483, 539, 568, 597 ,'Aerofoil Louvre')");

        sqLiteDatabase.execSQL("CREATE TABLE luna ( `Projection` INTEGER, `300` REAL, `400` REAL, `500` REAL, `600` REAL, `700` REAL, `800` REAL, `900` REAL, `1000` REAL, `1100` REAL, `1200` REAL, `1300` REAL,`option` TEXT )");
        sqLiteDatabase.execSQL("insert into luna Values(300, 5761, 6324, 7932, 8375, 8934, 9494, 12015, 12705, 13377, 13801, 15183,'standard')");
        sqLiteDatabase.execSQL("insert into luna Values(400, 6295, 6965, 8770, 9306, 9970, 10637, 13343, 14146, 14931, 15447, 17028, 'standard')");
        sqLiteDatabase.execSQL("insert into luna Values(500, 6830, 7604, 9607, 10237, 11007, 11781, 14671, 15587, 16486, 17093, 18873, 'standard')");
        sqLiteDatabase.execSQL("insert into luna Values(600, 7363, 8245, 10445, 11168, 12043, 12924, 15998, 17028, 18041, 18740, 20718, 'standard')");
        sqLiteDatabase.execSQL("insert into luna Values(700, 7898, 8884, 11282, 12099, 13080, 14067, 17326, 18468, 19595, 20386, 22563, 'standard')");
        sqLiteDatabase.execSQL("insert into luna Values(800, 9334, 10434, 13374, 14280, 15374, 16472, 20267, 21530, 22780, 23660, 26380, 'standard')");
        sqLiteDatabase.execSQL("insert into luna Values(900, 11056, 12314, 15574, 16582, 17830, 19084, 22109, 23514, 24905, 25879, 28872, 'standard')");
        sqLiteDatabase.execSQL("insert into luna Values(1000, 11658, 13024, 16517, 17618, 18971, 20331, 23576, 25093, 26599, 27664, 30891, 'standard')");
        sqLiteDatabase.execSQL("insert into luna Values(1100, 12263, 13734, 17459, 18653, 20112, 21579, 25043, 26674, 28292, 29449, 32910, 'standard')");
        sqLiteDatabase.execSQL("insert into luna Values(300, 6266, 6865, 8607, 9086, 9679, 10275, 12831, 13658, 14364, 14824, 16239,'HDD')");
        sqLiteDatabase.execSQL("insert into luna Values(400, 6881, 7596, 9550, 10132, 10843, 11557, 14309, 15260, 16092, 16653, 18282,'HDD')");
        sqLiteDatabase.execSQL("insert into luna Values(500, 7495, 8327, 10490, 11177, 12006, 12838, 15787, 16862, 17819, 18485, 20323,'HDD')");
        sqLiteDatabase.execSQL("insert into luna Values(600, 8143, 9095, 11465, 12258, 13204, 14155, 17298, 18499, 19582, 20351, 22399,'HDD')");
        sqLiteDatabase.execSQL("insert into luna Values(700, 8758, 9826, 12406, 13304, 14367, 15436, 18776, 20101, 21309, 22182, 24439,'HDD')");
        sqLiteDatabase.execSQL("insert into luna Values(800, 10273, 11467, 14601, 15601, 16788, 17979, 21867, 23325, 24667, 25640, 28453,'HDD')");
        sqLiteDatabase.execSQL("insert into luna Values(900, 12075, 13438, 16905, 18018, 19370, 20729, 23859, 25469, 26965, 28043, 31142,'HDD')");
        sqLiteDatabase.execSQL("insert into luna Values(1000, 12757, 14239, 17949, 19168, 20638, 22113, 25474, 27210, 28832, 30014, 33357,'HDD')");
        sqLiteDatabase.execSQL("insert into luna Values(1100, 13362, 14949, 18892, 20203, 21779, 23361, 26941, 28791, 30525, 31799, 35376,'HDD')");
        sqLiteDatabase.execSQL("insert into luna Values(null,142, 180, 276, 283, 322, 360, 399, 483, 539, 568, 597 ,'Aerofoil Louvre')");

        sqLiteDatabase.execSQL("CREATE TABLE mn3 ( `Projection` INTEGER, `300` REAL, `400` REAL, `450` REAL, `500` REAL, `600` REAL, `700` REAL, `800` REAL, `900` REAL, `1000` REAL, `1100` REAL, `1200` REAL, `1300` REAL,`option` TEXT )");
        sqLiteDatabase.execSQL("insert into mn3 Values(300, 3032, 3346, 3502, 4109, 4338, 4649, 4962, 5272, 6003, 6362, 6579, 6931, 'standard')");
        sqLiteDatabase.execSQL("insert into mn3 Values(400, 3368, 3753, 3944, 4657, 4945, 5327, 5711, 6090, 6958, 7396, 7669, 8099, 'standard')");
        sqLiteDatabase.execSQL("insert into mn3 Values(500, 3912, 4368, 4594, 5486, 5833, 6285, 6740, 7190, 8267, 8785, 9113, 9620, 'standard')");
        sqLiteDatabase.execSQL("insert into mn3 Values(300, 3537, 3887, 4059, 4784, 5049, 5395, 5742, 6087, 6956, 7349, 7601, 7988,'HDD')");
        sqLiteDatabase.execSQL("insert into mn3 Values(400, 3954, 4385, 4600, 5436, 5771, 6201, 6631, 7057, 8071, 8557, 8876, 9352,'HDD')");
        sqLiteDatabase.execSQL("insert into mn3 Values(500, 4577, 5091, 5347, 6368, 6773, 7284, 7798, 8307, 9542, 10119, 10505, 11070,'HDD')");


        sqLiteDatabase.execSQL("CREATE TABLE mn4 ( `Projection` INTEGER, `300` REAL, `400` REAL, `450` REAL, `500` REAL, `600` REAL, `700` REAL, `800` REAL, `900` REAL, `1000` REAL, `1100` REAL, `1200` REAL, `1300` REAL,`option` TEXT )");
        sqLiteDatabase.execSQL("insert into mn4 Values(300, 4241, 4623, 4811, 5548, 5843, 6220, 6600, 6976, 8623, 9052, 9335, 9757, 'standard')");
        sqLiteDatabase.execSQL("insert into mn4 Values(400, 4684, 5158, 5394, 6268, 6645, 7114, 7588, 8057, 9883, 10413, 10775, 11296, 'standard')");
        sqLiteDatabase.execSQL("insert into mn4 Values(500, 5301, 5869, 6150, 7219, 7676, 8239, 8805, 9367, 11429, 12060, 12501, 13121, 'standard')");
        sqLiteDatabase.execSQL("insert into mn4 Values(300, 4745, 5163, 5368, 6223, 6554, 6966, 7381, 7792, 9576, 10038, 10358, 10814,'HDD')");
        sqLiteDatabase.execSQL("insert into mn4 Values(400, 5271, 5790, 6050, 7047, 7471, 7988, 8508, 9023, 10996, 11574, 11981, 12550,'HDD')");
        sqLiteDatabase.execSQL("insert into mn4 Values(500, 5967, 6592, 6903, 8102, 8616, 9238, 9863, 10483, 12704, 13394, 13893, 14571,'HDD')");


        sqLiteDatabase.execSQL("CREATE TABLE tw22 ( `Projection` INTEGER, `300` REAL, `400` REAL, `450` REAL, `500` REAL, `600` REAL, `700` REAL, `800` REAL, `900` REAL, `1000` REAL, `1100` REAL, `1200` REAL, `1300` REAL,`option` TEXT )");
        sqLiteDatabase.execSQL("insert into tw22 Values(600, 7724, 8596, 9027, 10395, 11103, 11966, 13296, 14157, 15925, 16886, 17560, 18508, 'standard')");
        sqLiteDatabase.execSQL("insert into tw22 Values(800, 8397, 9409, 9910, 11488, 12316, 13321, 14793, 15795, 17836, 18954, 19742, 20844, 'standard')");
        sqLiteDatabase.execSQL("insert into tw22 Values(1000, 9069, 10223, 10796, 12584, 13529, 14674, 16291, 17433, 19746, 21023, 21923, 23180, 'standard')");
        sqLiteDatabase.execSQL("insert into tw22 Values(1200, 9740, 11039, 11680, 13678, 14743, 16030, 17789, 19073, 21658, 23091, 24105, 25516, 'standard')");
        sqLiteDatabase.execSQL("insert into tw22 Values(1400, 10412, 11853, 12564, 14774, 15956, 17385, 19286, 20710, 23569, 25161, 26287, 27852, 'standard')");
        sqLiteDatabase.execSQL("insert into tw22 Values(1600, 12723, 14450, 15305, 18408, 19833, 21549, 23738, 25446, 30853, 32752, 34127, 35995, 'standard')");
        sqLiteDatabase.execSQL("insert into tw22 Values(1800, 13714, 15641, 16593, 21582, 23150, 25063, 27452, 29356, 33657, 35791, 37295, 39392, 'standard')");
        sqLiteDatabase.execSQL("insert into tw22 Values(2000, 14575, 16661, 17691, 22971, 24672, 26744, 29292, 31354, 36014, 38322, 39955, 42224, 'standard')");
        sqLiteDatabase.execSQL("insert into tw22 Values(600, 8733, 9677, 10141, 11746, 12524, 13457, 14857, 15789, 17830, 18860, 19606, 20621,'HDD')");
        sqLiteDatabase.execSQL("insert into tw22 Values(800, 9569, 10672, 11222, 13048, 13968, 15068, 16633, 17727, 20063, 21276, 22154, 23351,'HDD')");
        sqLiteDatabase.execSQL("insert into tw22 Values(1000, 10400, 11669, 12302, 14350, 15410, 16673, 18407, 19666, 22296, 23690, 24707, 26080,'HDD')");
        sqLiteDatabase.execSQL("insert into tw22 Values(1200, 11300, 12738, 13451, 15720, 16922, 18352, 20250, 21672, 24599, 26173, 27327, 28878,'HDD')");
        sqLiteDatabase.execSQL("insert into tw22 Values(1400, 12132, 13735, 14529, 17022, 18366, 19958, 22024, 23611, 26834, 28589, 29879, 31605,'HDD')");
        sqLiteDatabase.execSQL("insert into tw22 Values(1600, 14602, 16516, 17466, 20861, 22474, 24377, 26752, 28647, 34442, 36526, 38086, 40142,'HDD')");
        sqLiteDatabase.execSQL("insert into tw22 Values(1800, 15754, 17888, 18947, 24244, 26021, 28143, 30742, 32856, 37567, 39911, 41623, 43932,'HDD')");
        sqLiteDatabase.execSQL("insert into tw22 Values(2000, 16773, 19091, 20241, 25836, 27772, 30077, 32856, 35151, 40247, 42789, 44653, 47156,'HDD')");
        sqLiteDatabase.execSQL("insert into tw22 Values(null,142, 180, 198, 276, 283, 322, 360, 399, 483, 539, 568, 597, 'Aerofoil Louvre')");

        sqLiteDatabase.execSQL("CREATE TABLE tw33 ( `Projection` INTEGER, `300` REAL, `400` REAL, `450` REAL, `500` REAL, `600` REAL, `700` REAL, `800` REAL, `900` REAL, `1000` REAL, `1100` REAL, `1200` REAL, `1300` REAL,`option` TEXT )");
        sqLiteDatabase.execSQL("insert into tw33 Values(600, 10303, 11325, 11830, 13532, 14370, 15385, 16868, 17880, 21561, 22687, 23501, 24611,'standard')");
        sqLiteDatabase.execSQL("insert into tw33 Values(800, 11189, 12396, 12996, 14974, 15973, 17173, 18843, 20041, 24082, 25410, 26381, 27689,'standard')");
        sqLiteDatabase.execSQL("insert into tw33 Values(1000, 12072, 13470, 14160, 16416, 17575, 18961, 20819, 22202, 26604, 28134, 29259, 30767,'standard')");
        sqLiteDatabase.execSQL("insert into tw33 Values(1200, 12958, 14541, 15324, 17858, 19178, 20751, 22795, 24361, 29121, 30855, 32139, 33846,'standard')");
        sqLiteDatabase.execSQL("insert into tw33 Values(1400, 13844, 15612, 16490, 19298, 20781, 22539, 24770, 26522, 31642, 33576, 35019, 36924,'standard')");
        sqLiteDatabase.execSQL("insert into tw33 Values(1600, 16501, 18471, 19446, 23214, 24849, 26804, 29236, 31183, 37349, 39503, 41102, 43223,'standard')");
        sqLiteDatabase.execSQL("insert into tw33 Values(1800, 19181, 21390, 22484, 26644, 28446, 30633, 33298, 35476, 40595, 43009, 44767, 47146,'standard')");
        sqLiteDatabase.execSQL("insert into tw33 Values(2000, 20207, 22602, 23788, 28294, 30257, 32629, 35482, 37847, 43393, 46010, 47927, 50506,'standard')");
        sqLiteDatabase.execSQL("insert into tw33 Values(2200, 21231, 23813, 25092, 29946, 32067, 34628, 37666, 40216, 46190, 49012, 51085, 53861,'standard')");
        sqLiteDatabase.execSQL("insert into tw33 Values(600, 11312, 12407, 12945, 14883, 15791, 16877, 18429, 19511, 23466, 24661, 25547, 26725,'HDD')");
        sqLiteDatabase.execSQL("insert into tw33 Values(800, 12361, 13659, 14308, 16533, 17625, 18920, 20683, 21973, 26309, 27732, 28794, 30196,'HDD')");
        sqLiteDatabase.execSQL("insert into tw33 Values(1000, 13403, 14916, 15666, 18181, 19456, 20959, 22935, 24435, 29154, 30801, 32042, 33667,'HDD')");
        sqLiteDatabase.execSQL("insert into tw33 Values(1200, 14518, 16240, 17096, 19899, 21357, 23073, 25256, 26960, 32063, 33937, 35361, 37208,'HDD')");
        sqLiteDatabase.execSQL("insert into tw33 Values(1400, 15564, 17495, 18455, 21545, 23191, 25112, 27508, 29422, 34907, 37004, 38612, 40677,'HDD')");
        sqLiteDatabase.execSQL("insert into tw33 Values(1600, 18380, 20537, 21607, 25667, 27490, 29632, 32250, 34385, 40937, 43277, 45061, 47370,'HDD')");
        sqLiteDatabase.execSQL("insert into tw33 Values(1800, 21221, 23638, 24839, 29305, 31318, 33713, 36588, 38976, 44505, 47129, 49095, 51686,'HDD')");
        sqLiteDatabase.execSQL("insert into tw33 Values(2000, 22405, 25032, 26339, 31159, 33357, 35962, 39046, 41644, 47626, 50476, 52626, 55437,'HDD')");
        sqLiteDatabase.execSQL("insert into tw33 Values(2200, 23429, 26244, 27643, 32811, 35168, 37961, 41229, 44013, 50423, 53478, 55784, 58793,'HDD')");
        sqLiteDatabase.execSQL("insert into tw33 Values(null,142, 180, 198, 276, 283, 322, 360, 399, 483, 539, 568, 597, 'Aerofoil Louvre')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        String sql = "drop table if exists student";
        sqLiteDatabase.execSQL(sql);
        onCreate(sqLiteDatabase);
    }

    public String[][] getProductInfoResult(String Name, String query) {
        // 읽기가 가능하게 DB 열기
        SQLiteDatabase db = getReadableDatabase();

        // DB에 있는 데이터를 쉽게 처리하기 위해 Cursor를 사용하여 테이블에 있는 모든 데이터 출력
        Cursor cursor = db.rawQuery("SELECT * FROM " + Name + " where Projection LIKE'" + query + "%';", null);
        cursor.moveToLast();
        int clength = cursor.getColumnCount();
        int rlength = cursor.getCount();
        cursor.moveToFirst();
        String[][] array = new String[rlength][clength];
        for (int i = 0; i < rlength; i++) {
            for (int j = 0; j < clength; j++) {
                array[i][j] = cursor.getString(j);
            }
            cursor.moveToNext();
        }

        return array;
    }

    public String[][] getWidthResult(String Name) {
        // 읽기가 가능하게 DB 열기
        SQLiteDatabase db = getReadableDatabase();

        // DB에 있는 데이터를 쉽게 처리하기 위해 Cursor를 사용하여 테이블에 있는 모든 데이터 출력
        Cursor cursor = db.rawQuery("SELECT " + changeProName(Name) + " FROM production_width_info", null);
        cursor.moveToLast();
        int clength = cursor.getColumnCount();
        int rlength = cursor.getCount();
        cursor.moveToFirst();
        String[] width = new String[rlength];
        String[][] array = new String[rlength][clength];
        for (int i = 0; i < rlength; i++) {
            for (int j = 0; j < clength; j++) {
                array[i][j] = cursor.getString(j);
            }
            cursor.moveToNext();
        }

        return array;
    }

    public String[][] getprojectionResult(String Name) {
        // 읽기가 가능하게 DB 열기
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT Projection FROM " + changeProName(Name) + " where option = 'standard'", null);


        cursor.moveToLast();
        int clength = cursor.getColumnCount();
        int rlength = cursor.getCount();
        cursor.moveToFirst();
        String[][] array = new String[rlength][clength];
        for (int i = 0; i < rlength; i++) {
            for (int j = 0; j < clength; j++) {
                array[i][j] = cursor.getString(j);
            }
            cursor.moveToNext();
        }

        return array;
    }

    public String[][] getOptionResult(String Name) {
        // 읽기가 가능하게 DB 열기
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT option2_overlap FROM production_info where p_name = '" + changeProName(Name) + "'", null);

        cursor.moveToLast();
        int clength = cursor.getColumnCount();
        int rlength = cursor.getCount();
        cursor.moveToFirst();
        String[][] array = new String[rlength][clength];
        for (int i = 0; i < rlength; i++) {
            for (int j = 0; j < clength; j++) {
                array[i][j] = cursor.getString(j);
            }
            cursor.moveToNext();
        }

        return array;
    }

    public String[][] getPriceResult(String Name, String Width, String Projection, String Option) {
        // 읽기가 가능하게 DB 열기
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT `" + Width + "` FROM " + changeProName(Name) + " where option = '" + Option + "' and Projection=" + Projection + "", null);
        Log.d("sad", "SELECT " + Width + " FROM " + Name + " where option = '" + Option + "'and Projection=" + Projection + "");
        cursor.moveToLast();
        int clength = cursor.getColumnCount();
        int rlength = cursor.getCount();
        cursor.moveToFirst();
        String[][] array = new String[rlength][clength];
        for (int i = 0; i < rlength; i++) {
            for (int j = 0; j < clength; j++) {
                array[i][j] = cursor.getString(j);
            }
            cursor.moveToNext();
        }

        return array;
    }

    public String[][] getOptionPriceResult(String Name, String Width, String Option) {
        // 읽기가 가능하게 DB 열기
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT `" + Width + "` FROM " + changeProName(Name) + " where option = '" + Option + "'", null);
        Log.d("sad", "SELECT " + Width + " FROM " + Name + " where option = '" + Option + "'");
        cursor.moveToLast();
        int clength = cursor.getColumnCount();
        int rlength = cursor.getCount();
        cursor.moveToFirst();
        String[][] array = new String[rlength][clength];
        for (int i = 0; i < rlength; i++) {
            for (int j = 0; j < clength; j++) {
                array[i][j] = cursor.getString(j);
            }
            cursor.moveToNext();
        }

        return array;
    }

    private String changeProName(String Name){
        switch (Name) {
            case "Plaza Novo":
                return "tw22";
            case "Plaza Radian":
                return "tw33";
            case "Cantilever Novo":
                return "mn3";
            case "Cantilever Radian":
                return "mn4";
            default:
                return Name;
        }
    }
}
