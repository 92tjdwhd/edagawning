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
        sqLiteDatabase.execSQL("insert into production_info Values( 'Standard','Exxen',11,0,0,0)");
        sqLiteDatabase.execSQL("insert into production_info Values( 'Standard','Rota',12,0,0,0)");
        sqLiteDatabase.execSQL("insert into production_info Values( 'Standard','vertex',13,0,2,0)");
        sqLiteDatabase.execSQL("insert into production_info Values( 'Standard','sapphire_two',14,0,2,0)");
        sqLiteDatabase.execSQL("insert into production_info Values( 'Standard','sapphire_three',15,0,2,0)");
        sqLiteDatabase.execSQL("insert into production_info Values( 'Standard','sliding_glass_3_2',16,0,2,0)");
        sqLiteDatabase.execSQL("insert into production_info Values( 'Standard','sliding_glass_3_3',16,0,2,0)");
        sqLiteDatabase.execSQL("insert into production_info Values( 'Standard','sliding_glass_5_4',16,0,2,0)");
        sqLiteDatabase.execSQL("insert into production_info Values( 'Standard','sliding_glass_5_5',16,0,2,0)");

        sqLiteDatabase.execSQL("CREATE TABLE production_width_info( `aerolux` TEXT, `axis` TEXT, `quattro` TEXT, `novo` TEXT, `radian` TEXT, `luna` TEXT, `mn3` TEXT, `mn4` TEXT, `tw22` TEXT, `tw33` TEXT, `exxen` TEXT, `rota` TEXT, `vertex` TEXT, `sapphire_two` TEXT, `sapphire_three` TEXT, `sliding_glass_3_2` TEXT, `sliding_glass_3_3` TEXT, `sliding_glass_5_4` TEXT, `sliding_glass_5_5` TEXT)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(1800,1800,2500,300,300,300,300,300,300,300,1800,1800,1000,2000,2000,1600,2200,2800,2800)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(2000,2000,3000,400,400,400,400,400,400,400,2000,2000,1200,2250,2250,1800,2400,3000,3000)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(2200,2200,3500,450,450,500,450,450,450,450,2200,2200,1400,2500,2500,2000,2600,3200,3200)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(2400,2400,4000,500,500,600,500,500,500,500,2400,2400,1600,2750,2750,2200,2800,3400,3400)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(2600,2600,4500,600,600,700,600,600,600,600,2600,2600,1800,3000,3000,2400,3000,3600,3600)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(2800,2800,5000,700,700,800,700,700,700,700,2800,2800,2000,3250,3250,null,3200,3800,3800)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(3000,3000,5500,800,800,900,800,800,800,800,3000,3000,2200,3500,3500,null,3400,4000,4000)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(3200,3200,null,900,900,1000,900,900,900,900,3200,3200,2400,3750,3750,null,3600,4200,4200)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(3400,3400,null,1000,1000,1100,1000,1000,1000,1000,3400,3400,2600,4000,4000,null,null,4400,4400)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(3600,3600,null,1100,1100,1200,1100,1100,1100,1100,3600,3600,2800,null,null,null,null,4600,4600)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(3800,3800,null,1200,1200,1300,1200,1200,1200,1200,3800,3800,3000,null,null,null,null,4800,4800)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(4000,4000,null,1300,1300,null,1300,1300,1300,1300,4000,4000,3200,null,null,null,null,null,5000)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(null,4200,null,null,null,null,null,null,null,null,4200,null,3400,null,null,null,null,null,5200)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(null,4400,null,null,null,null,null,null,null,null,4400,null,3600,null,null,null,null,null,5400)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(null,4500,null,null,null,null,null,null,null,null,4500,null,3800,null,null,null,null,null,5600)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(null,null,null,null,null,null,null,null,null,null,4600,null,4000,null,null,null,null,null,5800)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(null,null,null,null,null,null,null,null,null,null,4800,null,4200,null,null,null,null,null,6000)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(null,null,null,null,null,null,null,null,null,null,5000,null,4400,null,null,null,null,null,null)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(null,null,null,null,null,null,null,null,null,null,5200,null,4600,null,null,null,null,null,null)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(null,null,null,null,null,null,null,null,null,null,5400,null,4800,null,null,null,null,null,null)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(null,null,null,null,null,null,null,null,null,null,5600,null,5000,null,null,null,null,null,null)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(null,null,null,null,null,null,null,null,null,null,5800,null,5200,null,null,null,null,null,null)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(null,null,null,null,null,null,null,null,null,null,6000,null,5400,null,null,null,null,null,null)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(null,null,null,null,null,null,null,null,null,null,6200,null,5600,null,null,null,null,null,null)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(null,null,null,null,null,null,null,null,null,null,6400,null,5800,null,null,null,null,null,null)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(null,null,null,null,null,null,null,null,null,null,6600,null,6000,null,null,null,null,null,null)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(null,null,null,null,null,null,null,null,null,null,6800,null,null,null,null,null,null,null,null)");
        sqLiteDatabase.execSQL("insert into production_width_info Values(null,null,null,null,null,null,null,null,null,null,7000,null,null,null,null,null,null,null,null)");



        //exxen
        sqLiteDatabase.execSQL("CREATE TABLE exxen (`Projection` INTEGER, `1800` REAL, `2000` REAL, `2200` REAL, `2400` REAL, `2600` REAL, `2800` REAL, `3000` REAL, `3200` REAL, `3400` REAL, `3600` REAL, `3800` REAL, `4000` REAL,`4200` REAL,`4400` REAL,`4500` REAL,`4600` REAL,`4800` REAL,`5000` REAL,`5200` REAL,`5400` REAL,`5600` REAL,`5800` REAL,`6000` REAL,`6200` REAL,`6400` REAL,`6600` REAL,`6800` REAL,`7000` REAL,`option` TEXT )");
        sqLiteDatabase.execSQL("insert into exxen Values(1790, 5536, 5640, 5745, 5849, 5954, 6058, 6162, 6267, 6371, 6476, 6580, 6684, 6789, 6893, 6945, 7233, 7337, 7441, 7546, 7650, 7755, 7859, 7963, 8068, 8172, 8277, 8381, 8485, 'standard')");
        sqLiteDatabase.execSQL("insert into exxen Values(2040, 5769, 5883, 5997, 6111, 6225, 6338, 6452, 6566, 6680, 6794, 6908, 7021, 7135, 7249, 7306, 7632, 7745, 7859, 7973, 8087, 8201, 8315, 8428, 8542, 8656, 8770, 8884, 8998, 'standard')");
        sqLiteDatabase.execSQL("insert into exxen Values(2290, 6002, 6126, 6249, 6372, 6495, 6619, 6742, 6865, 6989, 7112, 7235, 7358, 7482, 7605, 7667, 8030, 8154, 8277, 8400, 8524, 8647, 8770, 8894, 9017, 9140, 9263, 9387, 9510, 'standard')");
        sqLiteDatabase.execSQL("insert into exxen Values(2540, 6235, 6368, 6501, 6634, 6766, 6899, 7032, 7164, 7297, 7430, 7563, 7695, 7828, 7961, 8027, 8429, 8562, 8695, 8828, 8960, 9093, 9226, 9359, 9491, 9624, 9757, 9889, 10022, 'standard')");
        sqLiteDatabase.execSQL("insert into exxen Values(2790, 6468, 6611, 6753, 6895, 7037, 7179, 7322, 7464, 7606, 7748, 7890, 8032, 8175, 8317, 8388, 8828, 8970, 9113, 9255, 9397, 9539, 9681, 9824, 9966, 10108, 10250, 10392, 10534, 'standard')");
        sqLiteDatabase.execSQL("insert into exxen Values(3040, 6702, 6853, 7005, 7156, 7308, 7460, 7611, 7763, 7915, 8066, 8218, 8369, 8521, 8673, 8748, 9227, 9379, 9530, 9682, 9834, 9985, 10137, 10289, 10440, 10592, 10743, 10895, 11047, 'standard')");
        sqLiteDatabase.execSQL("insert into exxen Values(3290, 6935, 7096, 7257, 7418, 7579, 7740, 7901, 8062, 8223, 8384, 8545, 8706, 8867, 9028, 9109, 9626, 9787, 9948, 10109, 10270, 10431, 10593, 10754, 10915, 11076, 11237, 11398, 11559, 'standard')");
        sqLiteDatabase.execSQL("insert into exxen Values(3540, 7168, 7338, 7509, 7679, 7850, 8020, 8191, 8361, 8532, 8702, 8873, 9043, 9214, 9384, 9470, 10025, 10196, 10366, 10537, 10707, 10878, 11048, 11219, 11389, 11560, 11730, 11901, 12071, 'standard')");
        sqLiteDatabase.execSQL("insert into exxen Values(3790, 7401, 7581, 7761, 7941, 8121, 8301, 8481, 8661, 8840, 9020, 9200, 9380, 9560, 9740, 9830, 10424, 10604, 10784, 10964, 11144, 11324, 11504, 11684, 11864, 12044, 12224, 12403, 12583, 'standard')");
        sqLiteDatabase.execSQL("insert into exxen Values(4040, 7634, 7823, 8013, 8202, 8392, 8581, 8770, 8960, 9149, 9339, 9528, 9717, 9907, 10096, 10191, 10823, 11012, 11202, 11391, 11580, 11770, 11959, 12149, 12338, 12527, 12717, 12906, 13096, 'standard')");
        sqLiteDatabase.execSQL("insert into exxen Values(4290, 7867, 8066, 8265, 8464, 8662, 8861, 9060, 9259, 9458, 9657, 9855, 10054, 10253, 10452, 10551, 11222, 11421, 11619, 11818, 12017, 12216, 12415, 12614, 12813, 13011, 13210, 13409, 13608, 'standard')");
        sqLiteDatabase.execSQL("insert into exxen Values(4540, 8100, 8308, 8517, 8725, 8933, 9142, 9350, 9558, 9766, 9975, 10183, 10391, 10600, 10808, 10912, 11621, 11829, 12037, 12246, 12454, 12662, 12870, 13079, 13287, 13495, 13704, 13912, 14120, 'standard')");
        sqLiteDatabase.execSQL("insert into exxen Values(4790, 8333, 8551, 8769, 8986, 9204, 9422, 9640, 9857, 10075, 10293, 10511, 10728, 10946, 11164, 11273, 12020, 12237, 12455, 12673, 12891, 13108, 13326, 13544, 13761, 13979, 14197, 14415, 14632, 'standard')");
        sqLiteDatabase.execSQL("insert into exxen Values(5040, 8566, 8793, 9021, 9248, 9475, 9702, 9929, 10157, 10384, 10611, 10838, 11065, 11292, 11520, 11633, 12419, 12646, 12873, 13100, 13327, 13554, 13782, 14009, 14236, 14463, 14690, 14917, 15145, 'standard')");
        sqLiteDatabase.execSQL("insert into exxen Values(5290, 8799, 9036, 9273, 9509, 9746, 9982, 10219, 10456, 10692, 10929, 11166, 11402, 11639, 11875, 11994, 12817, 13054, 13291, 13527, 13764, 14001, 14237, 14474, 14710, 14947, 15184, 15420, 15657, 'standard')");
        sqLiteDatabase.execSQL("insert into exxen Values(5540, 9032, 9279, 9525, 9771, 10017, 10263, 10509, 10755, 11001, 11247, 11493, 11739, 11985, 12231, 12354, 13216, 13462, 13709, 13955, 14201, 14447, 14693, 14939, 15185, 15431, 15677, 15923, 16169, 'standard')");
        sqLiteDatabase.execSQL("insert into exxen Values(5790, 9266, 9521, 9777, 10032, 10288, 10543, 10799, 11054, 11310, 11565, 11821, 12076, 12332, 12587, 12715, 13615, 13871, 14126, 14382, 14637, 14893, 15148, 15404, 15659, 15915, 16170, 16426, 16681, 'standard')");
        sqLiteDatabase.execSQL("insert into exxen Values(6040, 9499, 9764, 10029, 10294, 10558, 10823, 11088, 11353, 11618, 11883, 12148, 12413, 12678, 12943, 13076, 14014, 14279, 14544, 14809, 15074, 15339, 15604, 15869, 16134, 16399, 16664, 16929, 17194, 'standard')");
        sqLiteDatabase.execSQL("insert into exxen Values(6290, 9732, 10006, 10281, 10555, 10829, 11104, 11378, 11653, 11927, 12201, 12476, 12750, 13025, 13299, 13436, null, null, null, null, null, null, null, null, null, null, null, null, null, 'standard')");
        sqLiteDatabase.execSQL("insert into exxen Values(6540, 10711, 10994, 11278, 11562, 11846, 12130, 12414, 12698, 12981, 13265, 13549, 13833, 14117, 14401, 14543, null, null, null, null, null, null, null, null, null, null, null, null, null, 'standard')");
        sqLiteDatabase.execSQL("insert into exxen Values(6790, 10944, 11237, 11530, 11824, 12117, 12410, 12703, 12997, 13290, 13583, 13877, 14170, 14463, 14756, 14903, null, null, null, null, null, null, null, null, null, null, null, null, null, 'standard')");
        sqLiteDatabase.execSQL("insert into exxen Values(7040, 11177, 11480, 11782, 12085, 12388, 12690, 12993, 13296, 13599, 13901, 14204, 14507, 14810, 15112, 15264, null, null, null, null, null, null, null, null, null, null, null, null, null, 'standard')");
        sqLiteDatabase.execSQL("insert into exxen Values(7290, 11410, 11722, 12034, 12346, 12659, 12971, 13283, 13595, 13907, 14220, 14532, 14844, 15156, 15468, 15624, null, null, null, null, null, null, null, null, null, null, null, null, null, 'standard')");
        sqLiteDatabase.execSQL("insert into exxen Values(7540, 11643, 11965, 12286, 12608, 12930, 13251, 13573, 13894, 14216, 14538, 14859, 15181, 15502, 15824, 15985, null, null, null, null, null, null, null, null, null, null, null, null, null, 'standard')");
        sqLiteDatabase.execSQL("insert into exxen Values(7790, 11876, 12207, 12538, 12869, 13200, 13531, 13863, 14194, 14525, 14856, 15187, 15518, 15849, 16180, 16345, null, null, null, null, null, null, null, null, null, null, null, null, null, 'standard')");
        sqLiteDatabase.execSQL("insert into exxen Values(8040, 12109, 12450, 12790, 13131, 13471, 13812, 14152, 14493, 14833, 15174, 15514, 15855, 16195, 16536, 16706, null, null, null, null, null, null, null, null, null, null, null, null, null, 'standard')");
        sqLiteDatabase.execSQL("insert into exxen Values(1790, 1153, 1153, 1153, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1465, 1465, 1465, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1681, 1681, 1681, 1681, 1681, 1778, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into exxen Values(2040, 1153, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1465, 1465, 1465, 1465, 1601, 1601, 1601, 1601, 1601, 1681, 1681, 1681, 1681, 1681, 1778, 1778, 1778, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into exxen Values(2290, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1465, 1465, 1465, 1465, 1601, 1601, 1681, 1681, 1681, 1681, 1681, 1778, 1778, 1778, 1778, 1778, 1867, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into exxen Values(2540, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1465, 1465, 1465, 1465, 1465, 1681, 1681, 1681, 1681, 1681, 1778, 1778, 1778, 1778, 1778, 1867, 1867, 1867, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into exxen Values(2790, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1465, 1465, 1465, 1465, 1465, 1681, 1681, 1778, 1778, 1778, 1778, 1778, 1867, 1867, 1867, 1867, 1867, 1867, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into exxen Values(3040, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1465, 1465, 1465, 1465, 1465, 1778, 1778, 1778, 1778, 1778, 1867, 1867, 1867, 1867, 1867, 1867, 1867, 2000, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into exxen Values(3290, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1778, 1778, 1867, 1867, 1867, 1867, 1867, 1867, 1867, 2000, 2000, 2000, 2000, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into exxen Values(3540, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1867, 1867, 1867, 1867, 1867, 1867, 1867, 2000, 2000, 2000, 2000, 2000, 2000, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into exxen Values(3790, 1316, 1316, 1316, 1316, 1316, 1316, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1601, 1601, 1867, 1867, 1867, 1867, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into exxen Values(4040, 1316, 1316, 1316, 1316, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1601, 1601, 1601, 1867, 1867, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2167, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into exxen Values(4290, 1316, 1316, 1316, 1316, 1465, 1465, 1465, 1465, 1465, 1465, 1601, 1601, 1601, 1601, 1601, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2167, 2167, 2167, 2167, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into exxen Values(4540, 1316, 1316, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1601, 1601, 1601, 1601, 1601, 1601, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2167, 2167, 2167, 2167, 2167, 2167, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into exxen Values(4790, 1316, 1316, 1465, 1465, 1465, 1465, 1465, 1465, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 2000, 2000, 2000, 2000, 2167, 2167, 2167, 2167, 2167, 2167, 2167, 2167, 2167, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into exxen Values(5040, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1681, 2000, 2000, 2167, 2167, 2167, 2167, 2167, 2167, 2167, 2167, 2167, 2167, 2167, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into exxen Values(5290, 1465, 1465, 1465, 1465, 1465, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1681, 1681, 2167, 2167, 2167, 2167, 2167, 2167, 2167, 2167, 2167, 2167, 2167, 2300, 2300, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into exxen Values(5540, 1465, 1465, 1465, 1465, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1681, 1681, 1681, 1681, 2167, 2167, 2167, 2167, 2167, 2167, 2167, 2167, 2167, 2300, 2300, 2300, 2300, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into exxen Values(5790, 1465, 1465, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1681, 1681, 1681, 1681, 1681, 2167, 2167, 2167, 2167, 2167, 2167, 2300, 2300, 2300, 2300, 2300, 2300, 2300, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into exxen Values(6040, 1465, 1465, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1681, 1681, 1681, 1681, 1681, 1778, 2167, 2167, 2167, 2167, 2300, 2300, 2300, 2300, 2300, 2300, 2300, 2300, 2300, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into exxen Values(6290, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1681, 1681, 1681, 1681, 1681, 1778, 1778, null, null, null, null, null, null, null, null, null, null, null, null, null, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into exxen Values(6540, 1601, 1601, 1601, 1601, 1601, 1601, 1681, 1681, 1681, 1681, 1681, 1778, 1778, 1778, 1778, null, null, null, null, null, null, null, null, null, null, null, null, null, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into exxen Values(6790, 1601, 1601, 1601, 1601, 1601, 1681, 1681, 1681, 1681, 1681, 1778, 1778, 1778, 1778, 1778, null, null, null, null, null, null, null, null, null, null, null, null, null, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into exxen Values(7040, 1601, 1601, 1601, 1601, 1681, 1681, 1681, 1681, 1681, 1778, 1778, 1778, 1778, 1778, 1867, null, null, null, null, null, null, null, null, null, null, null, null, null, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into exxen Values(7290, 1601, 1601, 1601, 1681, 1681, 1681, 1681, 1681, 1778, 1778, 1778, 1778, 1867, 1867, 1867, null, null, null, null, null, null, null, null, null, null, null, null, null, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into exxen Values(7540, 1601, 1681, 1681, 1681, 1681, 1681, 1778, 1778, 1778, 1778, 1778, 1867, 1867, 1867, 1867, null, null, null, null, null, null, null, null, null, null, null, null, null, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into exxen Values(7790, 1681, 1681, 1681, 1681, 1681, 1778, 1778, 1778, 1778, 1778, 1867, 1867, 1867, 1867, 1867, null, null, null, null, null, null, null, null, null, null, null, null, null, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into exxen Values(8040, 1681, 1681, 1681, 1681, 1778, 1778, 1778, 1778, 1778, 1867, 1867, 1867, 1867, 1867, 1867, null, null, null, null, null, null, null, null, null, null, null, null, null, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into exxen Values(1790, 1277, 1277, 1277, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1680, 1680, 1680, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 2076, 2076, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into exxen Values(2040, 1277, 1277, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1680, 1680, 1680, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 2076, 2076, 2076, 2076, 2076, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into exxen Values(2290, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1680, 1680, 1680, 1854, 1854, 1854, 1854, 1854, 1854, 2076, 2076, 2076, 2076, 2076, 2076, 2076, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into exxen Values(2540, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1680, 1680, 1680, 1680, 1854, 1854, 1854, 2076, 2076, 2076, 2076, 2076, 2076, 2076, 2076, 2076, 2076, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into exxen Values(2790, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1680, 1680, 1680, 1680, 1680, 1680, 1854, 2076, 2076, 2076, 2076, 2076, 2076, 2076, 2076, 2076, 2076, 2076, 2076, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into exxen Values(3040, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 2076, 2076, 2076, 2076, 2076, 2076, 2076, 2076, 2076, 2076, 2076, 2294, 2294, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into exxen Values(3290, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 2076, 2076, 2076, 2076, 2076, 2076, 2076, 2076, 2294, 2294, 2294, 2294, 2294, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into exxen Values(3540, 1481, 1481, 1481, 1481, 1481, 1481, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 2076, 2076, 2076, 2076, 2076, 2076, 2294, 2294, 2294, 2294, 2294, 2294, 2294, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into exxen Values(3790, 1481, 1481, 1481, 1481, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 2076, 2076, 2076, 2294, 2294, 2294, 2294, 2294, 2294, 2294, 2294, 2294, 2294, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into exxen Values(4040, 1481, 1481, 1481, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1854, 1854, 2076, 2294, 2294, 2294, 2294, 2294, 2294, 2294, 2294, 2294, 2294, 2294, 2294, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into exxen Values(4290, 1481, 1481, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1854, 1854, 1854, 2294, 2294, 2294, 2294, 2294, 2294, 2294, 2294, 2294, 2294, 2294, 2294, 2294, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into exxen Values(4540, 1481, 1481, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1854, 1854, 1854, 1854, 1854, 2294, 2294, 2294, 2294, 2294, 2294, 2294, 2294, 2294, 2294, 2440, 2440, 2440, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into exxen Values(4790, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1854, 1854, 1854, 1854, 1854, 1854, 2294, 2294, 2294, 2294, 2294, 2294, 2294, 2294, 2440, 2440, 2440, 2440, 2440, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into exxen Values(5040, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 2294, 2294, 2294, 2294, 2294, 2440, 2440, 2440, 2440, 2440, 2440, 2440, 2440, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into exxen Values(5290, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 2294, 2294, 2294, 2440, 2440, 2440, 2440, 2440, 2440, 2440, 2440, 2440, 2440, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into exxen Values(5540, 1680, 1680, 1680, 1680, 1680, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 2440, 2440, 2440, 2440, 2440, 2440, 2440, 2440, 2440, 2549, 2549, 2549, 2549, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into exxen Values(5790, 1680, 1680, 1680, 1680, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 2076, 2440, 2440, 2440, 2440, 2440, 2440, 2440, 2440, 2549, 2549, 2549, 2549, 2549, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into exxen Values(6040, 1680, 1680, 1680, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 2076, 2076, 2440, 2440, 2440, 2440, 2440, 2549, 2549, 2549, 2549, 2549, 2549, 2549, 2549, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into exxen Values(6290, 1680, 1680, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 2076, 2076, 2076, 2076, null, null, null, null, null, null, null, null, null, null, null, null, null, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into exxen Values(6540, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 2076, 2076, 2076, 2076, 2076, null, null, null, null, null, null, null, null, null, null, null, null, null, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into exxen Values(6790, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 2076, 2076, 2076, 2076, 2076, 2076, null, null, null, null, null, null, null, null, null, null, null, null, null, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into exxen Values(7040, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 2076, 2076, 2076, 2076, 2076, 2076, 2076, null, null, null, null, null, null, null, null, null, null, null, null, null, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into exxen Values(7290, 1854, 1854, 1854, 1854, 1854, 1854, 2076, 2076, 2076, 2076, 2076, 2076, 2076, 2076, 2076, null, null, null, null, null, null, null, null, null, null, null, null, null, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into exxen Values(7540, 1854, 1854, 1854, 1854, 1854, 2076, 2076, 2076, 2076, 2076, 2076, 2076, 2076, 2076, 2076, null, null, null, null, null, null, null, null, null, null, null, null, null, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into exxen Values(7790, 1854, 1854, 1854, 1854, 2076, 2076, 2076, 2076, 2076, 2076, 2076, 2076, 2076, 2076, 2076, null, null, null, null, null, null, null, null, null, null, null, null, null, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into exxen Values(8040, 1854, 1854, 2076, 2076, 2076, 2076, 2076, 2076, 2076, 2076, 2076, 2076, 2076, 2076, 2076, null, null, null, null, null, null, null, null, null, null, null, null, null, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into exxen Values(1790, 160, 170, 180, 190, 199, 209, 219, 229, 238, 248, 258, 268, 277, 287, 297, 307, 317, 326, 336, 346, 356, 365, 375, 385, 395, 404, 414, 424, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into exxen Values(2040, 176, 188, 199, 211, 222, 234, 245, 257, 268, 280, 291, 303, 314, 326, 338, 349, 361, 372, 384, 395, 407, 418, 430, 441, 453, 464, 476, 487, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into exxen Values(2290, 192, 205, 219, 232, 245, 258, 272, 285, 298, 312, 325, 338, 351, 365, 378, 391, 405, 418, 431, 445, 458, 471, 484, 498, 511, 524, 538, 551, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into exxen Values(2540, 208, 223, 238, 253, 268, 283, 298, 313, 328, 343, 358, 373, 388, 404, 419, 434, 449, 464, 479, 494, 509, 524, 539, 554, 569, 584, 599, 614, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into exxen Values(2790, 224, 240, 257, 274, 291, 308, 325, 341, 358, 375, 392, 409, 425, 442, 459, 476, 493, 510, 526, 543, 560, 577, 594, 610, 627, 644, 661, 678, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into exxen Values(3040, 239, 258, 277, 295, 314, 332, 351, 369, 388, 407, 425, 444, 462, 481, 500, 518, 537, 555, 574, 593, 611, 630, 648, 667, 685, 704, 723, 741, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into exxen Values(3290, 255, 276, 296, 316, 337, 357, 377, 398, 418, 438, 459, 479, 499, 520, 540, 560, 581, 601, 622, 642, 662, 683, 703, 723, 744, 764, 784, 805, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into exxen Values(3540, 271, 293, 315, 337, 359, 382, 404, 426, 448, 470, 492, 514, 536, 559, 581, 603, 625, 647, 669, 691, 713, 735, 758, 780, 802, 824, 846, 868, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into exxen Values(3790, 287, 311, 335, 358, 382, 406, 430, 454, 478, 502, 526, 550, 573, 597, 621, 645, 669, 693, 717, 741, 764, 788, 812, 836, 860, 884, 908, 932, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into exxen Values(4040, 303, 328, 354, 380, 405, 431, 457, 482, 508, 533, 559, 585, 610, 636, 662, 687, 713, 739, 764, 790, 816, 841, 867, 893, 918, 944, 969, 995, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into exxen Values(4290, 318, 346, 373, 401, 428, 456, 483, 510, 538, 565, 593, 620, 647, 675, 702, 730, 757, 784, 812, 839, 867, 894, 922, 949, 976, 1004, 1031, 1059, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into exxen Values(4540, 334, 363, 393, 422, 451, 480, 509, 539, 568, 597, 626, 655, 684, 714, 743, 772, 801, 830, 859, 889, 918, 947, 976, 1005, 1035, 1064, 1093, 1122, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into exxen Values(4790, 350, 381, 412, 443, 474, 505, 536, 567, 598, 629, 659, 690, 721, 752, 783, 814, 845, 876, 907, 938, 969, 1000, 1031, 1062, 1093, 1124, 1155, 1186, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into exxen Values(5040, 366, 399, 431, 464, 497, 529, 562, 595, 628, 660, 693, 726, 758, 791, 824, 856, 889, 922, 955, 987, 1020, 1053, 1085, 1118, 1151, 1184, 1216, 1249, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into exxen Values(5290, 382, 416, 451, 485, 520, 554, 589, 623, 657, 692, 726, 761, 795, 830, 864, 899, 933, 968, 1002, 1037, 1071, 1106, 1140, 1175, 1209, 1243, 1278, 1312, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into exxen Values(5540, 398, 434, 470, 506, 542, 579, 615, 651, 687, 724, 760, 796, 832, 869, 905, 941, 977, 1014, 1050, 1086, 1122, 1158, 1195, 1231, 1267, 1303, 1340, 1376, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into exxen Values(5790, 413, 451, 489, 527, 565, 603, 641, 679, 717, 755, 793, 831, 869, 907, 945, 983, 1021, 1059, 1097, 1135, 1173, 1211, 1249, 1287, 1325, 1363, 1401, 1439, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into exxen Values(6040, 429, 469, 509, 548, 588, 628, 668, 708, 747, 787, 827, 867, 906, 946, 986, 1026, 1065, 1105, 1145, 1185, 1224, 1264, 1304, 1344, 1384, 1423, 1463, 1503, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into exxen Values(6290, 445, 486, 528, 570, 611, 653, 694, 736, 777, 819, 860, 902, 943, 985, 1026, null, null, null, null, null, null, null, null, null, null, null, null, null, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into exxen Values(6540, 461, 504, 547, 591, 634, 677, 721, 764, 807, 850, 894, 937, 980, 1024, 1067, null, null, null, null, null, null, null, null, null, null, null, null, null, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into exxen Values(6790, 477, 522, 567, 612, 657, 702, 747, 792, 837, 882, 927, 972, 1017, 1062, 1107, null, null, null, null, null, null, null, null, null, null, null, null, null, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into exxen Values(7040, 492, 539, 586, 633, 680, 727, 773, 820, 867, 914, 961, 1007, 1054, 1101, 1148, null, null, null, null, null, null, null, null, null, null, null, null, null, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into exxen Values(7290, 508, 557, 605, 654, 703, 751, 800, 848, 897, 946, 994, 1043, 1091, 1140, 1188, null, null, null, null, null, null, null, null, null, null, null, null, null, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into exxen Values(7540, 524, 574, 625, 675, 725, 776, 826, 877, 927, 977, 1028, 1078, 1128, 1179, 1229, null, null, null, null, null, null, null, null, null, null, null, null, null, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into exxen Values(7790, 540, 592, 644, 696, 748, 800, 853, 905, 957, 1009, 1061, 1113, 1165, 1217, 1270, null, null, null, null, null, null, null, null, null, null, null, null, null, 'Insulation Foam')");
        sqLiteDatabase.execSQL("insert into exxen Values(8040, 556, 610, 663, 717, 771, 825, 879, 933, 987, 1041, 1095, 1148, 1202, 1256, 1310, null, null, null, null, null, null, null, null, null, null, null, null, null, 'Insulation Foam')");

        //rota
        sqLiteDatabase.execSQL("CREATE TABLE rota (`Projection` INTEGER, `1800` REAL, `2000` REAL, `2200` REAL, `2400` REAL, `2600` REAL, `2800` REAL, `3000` REAL, `3200` REAL, `3400` REAL, `3600` REAL, `3800` REAL, `4000` REAL, `option` TEXT )");
        sqLiteDatabase.execSQL("insert into rota Values(1134, 4029, 4082, 4134, 4186, 4239, 4291, 4343, 4396, 4448, 4501, 4553, 4605, 'standard')");
        sqLiteDatabase.execSQL("insert into rota Values(1292, 4134, 4191, 4248, 4306, 4363, 4420, 4478, 4535, 4592, 4650, 4707, 4764, 'standard')");
        sqLiteDatabase.execSQL("insert into rota Values(1450, 4238, 4300, 4363, 4425, 4487, 4550, 4612, 4674, 4737, 4799, 4861, 4923, 'standard')");
        sqLiteDatabase.execSQL("insert into rota Values(1608, 4342, 4410, 4477, 4544, 4611, 4679, 4746, 4813, 4881, 4948, 5015, 5083, 'standard')");
        sqLiteDatabase.execSQL("insert into rota Values(1766, 4447, 4519, 4591, 4663, 4736, 4808, 4880, 4953, 5025, 5097, 5169, 5242, 'standard')");
        sqLiteDatabase.execSQL("insert into rota Values(1924, 4551, 4628, 4705, 4783, 4860, 4937, 5014, 5092, 5169, 5246, 5324, 5401, 'standard')");
        sqLiteDatabase.execSQL("insert into rota Values(2082, 4655, 4737, 4820, 4902, 4984, 5066, 5149, 5231, 5313, 5395, 5478, 5560, 'standard')");
        sqLiteDatabase.execSQL("insert into rota Values(2240, 4759, 4847, 4934, 5021, 5108, 5196, 5283, 5370, 5457, 5545, 5632, 5719, 'standard')");
        sqLiteDatabase.execSQL("insert into rota Values(2398, 4864, 4956, 5048, 5140, 5233, 5325, 5417, 5509, 5601, 5694, 5786, 5878, 'standard')");
        sqLiteDatabase.execSQL("insert into rota Values(2556, 4968, 5065, 5162, 5260, 5357, 5454, 5551, 5648, 5746, 5843, 5940, 6037, 'standard')");
        sqLiteDatabase.execSQL("insert into rota Values(2714, 5072, 5174, 5277, 5379, 5481, 5583, 5685, 5788, 5890, 5992, 6094, 6196, 'standard')");
        sqLiteDatabase.execSQL("insert into rota Values(2872, 5177, 5284, 5391, 5498, 5605, 5712, 5820, 5927, 6034, 6141, 6248, 6355, 'standard')");
        sqLiteDatabase.execSQL("insert into rota Values(3030, 5281, 5393, 5505, 5617, 5729, 5842, 5954, 6066, 6178, 6290, 6402, 6514, 'standard')");
        sqLiteDatabase.execSQL("insert into rota Values(3188, 5385, 5502, 5619, 5737, 5854, 5971, 6088, 6205, 6322, 6439, 6556, 6674, 'standard')");
        sqLiteDatabase.execSQL("insert into rota Values(3346, 5490, 5612, 5734, 5856, 5978, 6100, 6222, 6344, 6466, 6588, 6711, 6833, 'standard')");
        sqLiteDatabase.execSQL("insert into rota Values(3504, 5594, 5721, 5848, 5975, 6102, 6229, 6356, 6483, 6611, 6738, 6865, 6992, 'standard')");
        sqLiteDatabase.execSQL("insert into rota Values(3662, 5698, 5830, 5962, 6094, 6226, 6358, 6491, 6623, 6755, 6887, 7019, 7151, 'standard')");
        sqLiteDatabase.execSQL("insert into rota Values(3820, 5802, 5939, 6077, 6214, 6351, 6488, 6625, 6762, 6899, 7036, 7173, 7310, 'standard')");
        sqLiteDatabase.execSQL("insert into rota Values(3978, 5907, 6049, 6191, 6333, 6475, 6617, 6759, 6901, 7043, 7185, 7327, 7469, 'standard')");
        sqLiteDatabase.execSQL("insert into rota Values(4136, 6011, 6158, 6305, 6452, 6599, 6746, 6893, 7040, 7187, 7334, 7481, 7628, 'standard')");
        sqLiteDatabase.execSQL("insert into rota Values(4294, 6115, 6267, 6419, 6571, 6723, 6875, 7027, 7179, 7331, 7483, 7635, 7787, 'standard')");
        sqLiteDatabase.execSQL("insert into rota Values(4452, 6220, 6377, 6534, 6691, 6848, 7005, 7161, 7318, 7475, 7632, 7789, 7946, 'standard')");
        sqLiteDatabase.execSQL("insert into rota Values(4610, 6324, 6486, 6648, 6810, 6972, 7134, 7296, 7458, 7620, 7782, 7944, 8105, 'standard')");
        sqLiteDatabase.execSQL("insert into rota Values(4768, 6428, 6595, 6762, 6929, 7096, 7263, 7430, 7597, 7764, 7931, 8098, 8265, 'standard')");
        sqLiteDatabase.execSQL("insert into rota Values(4926, 6533, 6704, 6876, 7048, 7220, 7392, 7564, 7736, 7908, 8080, 8252, 8424, 'standard')");
        sqLiteDatabase.execSQL("insert into rota Values(5084, 6637, 6814, 6991, 7168, 7344, 7521, 7698, 7875, 8052, 8229, 8406, 8583, 'standard')");
        sqLiteDatabase.execSQL("insert into rota Values(5242, 6741, 6923, 7105, 7287, 7469, 7651, 7832, 8014, 8196, 8378, 8560, 8742, 'standard')");
        sqLiteDatabase.execSQL("insert into rota Values(5400, 6845, 7032, 7219, 7406, 7593, 7780, 7967, 8153, 8340, 8527, 8714, 8901, 'standard')");
        sqLiteDatabase.execSQL("insert into rota Values(5558, 6950, 7142, 7333, 7525, 7717, 7909, 8101, 8293, 8485, 8676, 8868, 9060, 'standard')");
        sqLiteDatabase.execSQL("insert into rota Values(5716, 7054, 7251, 7448, 7645, 7841, 8038, 8235, 8432, 8629, 8826, 9022, 9219, 'standard')");
        sqLiteDatabase.execSQL("insert into rota Values(5874, 7158, 7360, 7562, 7764, 7966, 8167, 8369, 8571, 8773, 8975, 9176, 9378, 'standard')");
        sqLiteDatabase.execSQL("insert into rota Values(6032, 7263, 7469, 7676, 7883, 8090, 8297, 8503, 8710, 8917, 9124, 9331, 9537, 'standard')");
        sqLiteDatabase.execSQL("insert into rota Values(1134, 1084, 1084, 1084, 1084, 1084, 1084, 1237, 1237, 1237, 1237, 1237, 1237, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into rota Values(1292, 1141, 1141, 1141, 1141, 1141, 1141, 1302, 1302, 1302, 1302, 1302, 1302, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into rota Values(1450, 1153, 1153, 1153, 1153, 1153, 1153, 1316, 1316, 1316, 1316, 1316, 1316, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into rota Values(1608, 1153, 1153, 1153, 1153, 1153, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into rota Values(1766, 1153, 1153, 1153, 1153, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into rota Values(1924, 1153, 1153, 1153, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into rota Values(2082, 1153, 1153, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into rota Values(2240, 1153, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1465, 1465, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into rota Values(2398, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1465, 1465, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into rota Values(2556, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1465, 1465, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into rota Values(2714, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1465, 1465, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into rota Values(2872, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1465, 1465, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into rota Values(3030, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1465, 1465, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into rota Values(3188, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1465, 1465, 1465, 1465, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into rota Values(3346, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1465, 1465, 1465, 1465, 1465, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into rota Values(3504, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1465, 1465, 1465, 1465, 1465, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into rota Values(3662, 1316, 1316, 1316, 1316, 1316, 1316, 1316, 1465, 1465, 1465, 1465, 1465, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into rota Values(3820, 1316, 1316, 1316, 1316, 1316, 1316, 1465, 1465, 1465, 1465, 1465, 1465, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into rota Values(3978, 1316, 1316, 1316, 1316, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into rota Values(4136, 1316, 1316, 1316, 1316, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into rota Values(4294, 1316, 1316, 1316, 1316, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into rota Values(4452, 1316, 1316, 1316, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into rota Values(4610, 1316, 1316, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into rota Values(4768, 1316, 1316, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into rota Values(4926, 1316, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into rota Values(5084, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1601, 1601, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into rota Values(5242, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1601, 1601, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into rota Values(5400, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1601, 1601, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into rota Values(5558, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1601, 1601, 1601, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into rota Values(5716, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1465, 1601, 1601, 1601, 1601, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into rota Values(5874, 1465, 1465, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into rota Values(6032, 1465, 1465, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 1601, 'Led Stripe Dimmer Lighting')");
        sqLiteDatabase.execSQL("insert into rota Values(1134, 1252, 1252, 1252, 1252, 1252, 1252, 1451, 1451, 1451, 1451, 1451, 1451, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into rota Values(1292, 1277, 1277, 1277, 1277, 1277, 1277, 1481, 1481, 1481, 1481, 1481, 1481, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into rota Values(1450, 1277, 1277, 1277, 1277, 1277, 1366, 1481, 1481, 1481, 1481, 1481, 1481, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into rota Values(1608, 1277, 1277, 1277, 1277, 1277, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into rota Values(1766, 1277, 1277, 1277, 1277, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into rota Values(1924, 1277, 1277, 1277, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into rota Values(2082, 1277, 1277, 1366, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into rota Values(2240, 1277, 1277, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into rota Values(2398, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into rota Values(2556, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1680, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into rota Values(2714, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1680, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into rota Values(2872, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1680, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into rota Values(3030, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1680, 1680, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into rota Values(3188, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1560, 1560, 1680, 1680, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into rota Values(3346, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1612, 1612, 1680, 1680, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into rota Values(3504, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1680, 1680, 1680, 1680, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into rota Values(3662, 1481, 1481, 1481, 1481, 1481, 1481, 1481, 1680, 1680, 1680, 1680, 1680, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into rota Values(3820, 1481, 1481, 1481, 1481, 1481, 1481, 1680, 1680, 1680, 1680, 1680, 1680, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into rota Values(3978, 1481, 1481, 1481, 1481, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into rota Values(4136, 1481, 1481, 1481, 1481, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into rota Values(4294, 1481, 1481, 1481, 1481, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into rota Values(4452, 1481, 1481, 1481, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into rota Values(4610, 1481, 1481, 1612, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into rota Values(4768, 1481, 1481, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into rota Values(4926, 1481, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into rota Values(5084, 1560, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1854, 1854, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into rota Values(5242, 1612, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1854, 1854, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into rota Values(5400, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1854, 1854, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into rota Values(5558, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1854, 1854, 1854, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into rota Values(5716, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1680, 1854, 1854, 1854, 1854, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into rota Values(5874, 1680, 1680, 1792, 1792, 1792, 1792, 1792, 1854, 1854, 1854, 1854, 1854, 'RGB Led-Hidden Stripe Lightin')");
        sqLiteDatabase.execSQL("insert into rota Values(6032, 1680, 1680, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 1854, 'RGB Led-Hidden Stripe Lightin')");

        //vertex
        sqLiteDatabase.execSQL("CREATE TABLE vertex (`Projection` INTEGER, `1000` REAL, `1200` REAL, `1400` REAL, `1600` REAL, `1800` REAL, `2000` REAL, `2200` REAL, `2400` REAL, `2600` REAL, `2800` REAL, `3000` REAL, `3200` REAL, `3400` REAL, `3600` REAL, `3800` REAL, `4000` REAL,`4200` REAL,`4400` REAL,`4600` REAL,`4800` REAL,`5000` REAL,`5200` REAL,`5400` REAL,`5600` REAL,`5800` REAL,`6000` REAL,`option` TEXT)");
        sqLiteDatabase.execSQL("insert into vertex Values(1000, 664, 695, 726, 757, 788, 819, 850, 881, 912, 943, 1022, 1053, 1084, 1115, 1146, 1177, 1208, 1239, 1270, 1301, 1332, 1363, 1394, 1464, 1495, 1526, 'standard')");
        sqLiteDatabase.execSQL("insert into vertex Values(1200, 675, 708, 741, 774, 807, 840, 873, 906, 939, 1020, 1053, 1086, 1119, 1152, 1185, 1218, 1251, 1284, 1317, 1349, 1382, 1415, 1448, 1520, 1553, 1586, 'standard')");
        sqLiteDatabase.execSQL("insert into vertex Values(1400, 687, 721, 756, 791, 826, 861, 896, 931, 966, 1049, 1084, 1119, 1153, 1188, 1223, 1258, 1293, 1328, 1363, 1398, 1433, 1468, 1503, 1576, 1611, 1646, 'standard')");
        sqLiteDatabase.execSQL("insert into vertex Values(1600, 698, 735, 771, 808, 845, 882, 919, 956, 993, 1077, 1114, 1151, 1188, 1225, 1262, 1299, 1336, 1373, 1409, 1446, 1483, 1520, 1557, 1633, 1669, 1706, 'standard')");
        sqLiteDatabase.execSQL("insert into vertex Values(1800, 709, 748, 786, 825, 864, 903, 942, 981, 1019, 1106, 1145, 1184, 1223, 1262, 1300, 1339, 1378, 1417, 1456, 1495, 1533, 1572, 1650, 1689, 1728, 1767, 'standard')");
        sqLiteDatabase.execSQL("insert into vertex Values(2000, 720, 761, 801, 842, 883, 924, 965, 1005, 1046, 1135, 1176, 1217, 1257, 1298, 1339, 1380, 1421, 1461, 1502, 1543, 1584, 1625, 1704, 1745, 1786, 1827, 'standard')");
        sqLiteDatabase.execSQL("insert into vertex Values(2200, 731, 774, 817, 859, 902, 945, 988, 1030, 1073, 1164, 1207, 1249, 1292, 1335, 1378, 1420, 1463, 1506, 1549, 1591, 1634, 1677, 1759, 1801, 1844, 1887, 'standard')");
        sqLiteDatabase.execSQL("insert into vertex Values(2400, 742, 787, 832, 876, 921, 966, 1010, 1055, 1100, 1193, 1237, 1282, 1327, 1371, 1416, 1461, 1506, 1550, 1595, 1640, 1685, 1729, 1813, 1858, 1902, 1947, 'standard')");
        sqLiteDatabase.execSQL("insert into vertex Values(2600, 753, 800, 847, 893, 940, 987, 1033, 1080, 1127, 1221, 1268, 1315, 1361, 1408, 1455, 1501, 1548, 1595, 1642, 1688, 1735, 1782, 1867, 1914, 1961, 2007, 'standard')");
        sqLiteDatabase.execSQL("insert into vertex Values(2800, 764, 813, 862, 910, 959, 1008, 1056, 1105, 1154, 1250, 1299, 1347, 1396, 1445, 1493, 1542, 1591, 1639, 1688, 1737, 1785, 1834, 1921, 1970, 2019, 2067, 'standard')");
        sqLiteDatabase.execSQL("insert into vertex Values(3000, 775, 826, 877, 927, 978, 1028, 1079, 1130, 1180, 1279, 1330, 1380, 1431, 1481, 1532, 1583, 1633, 1684, 1734, 1785, 1836, 1886, 1976, 2026, 2077, 2128, 'standard')");
        sqLiteDatabase.execSQL("insert into vertex Values(3200, 787, 839, 892, 944, 997, 1049, 1102, 1155, 1207, 1308, 1360, 1413, 1465, 1518, 1571, 1623, 1676, 1728, 1781, 1833, 1886, 1977, 2030, 2083, 2135, 2188, 'standard')");
        sqLiteDatabase.execSQL("insert into vertex Values(3400, 798, 852, 907, 961, 1016, 1070, 1125, 1179, 1234, 1336, 1391, 1446, 1500, 1555, 1609, 1664, 1718, 1773, 1827, 1882, 1936, 2030, 2084, 2139, 2193, 2248, 'standard')");
        sqLiteDatabase.execSQL("insert into vertex Values(3600, 809, 865, 922, 978, 1035, 1091, 1148, 1204, 1261, 1365, 1422, 1478, 1535, 1591, 1648, 1704, 1761, 1817, 1874, 1930, 1987, 2082, 2139, 2195, 2252, 2308, 'standard')");
        sqLiteDatabase.execSQL("insert into vertex Values(3800, 820, 878, 937, 995, 1054, 1112, 1171, 1229, 1336, 1394, 1452, 1511, 1569, 1628, 1686, 1745, 1803, 1862, 1920, 1979, 2037, 2134, 2193, 2251, 2310, 2368, 'standard')");
        sqLiteDatabase.execSQL("insert into vertex Values(4000, 831, 891, 952, 1012, 1073, 1133, 1194, 1254, 1362, 1423, 1483, 1544, 1604, 1664, 1725, 1785, 1846, 1906, 1967, 2027, 2087, 2187, 2247, 2308, 2368, 2428, 'standard')");

        //sapphire_two
        sqLiteDatabase.execSQL("CREATE TABLE sapphire_two (`Projection` INTEGER, `2000` REAL, `2250` REAL, `2500` REAL, `2750` REAL, `3000` REAL, `3250` REAL, `3500` REAL, `3750` REAL, `4000` REAL,`option` TEXT)");
        sqLiteDatabase.execSQL("insert into sapphire_two Values(2000, 1575, 1647, 1719, 1792, 1864, 1936, 2008, 2081, 2153, 'standard')");
        sqLiteDatabase.execSQL("insert into sapphire_two Values(2250, 1634, 1711, 1789, 1865, 1943, 2020, 2097, 2174, 2251, 'standard')");
        sqLiteDatabase.execSQL("insert into sapphire_two Values(2500, 1693, 1775, 1857, 1939, 2022, 2104, 2186, 2268, 2350, 'standard')");
        sqLiteDatabase.execSQL("insert into sapphire_two Values(2750, 1752, 1839, 1926, 2013, 2101, 2187, 2274, 2362, 2449, 'standard')");
        sqLiteDatabase.execSQL("insert into sapphire_two Values(3000, 1812, 1904, 1996, 2088, 2180, 2271, 2363, 2455, 2547, 'standard')");

        //sapphire_three
        sqLiteDatabase.execSQL("CREATE TABLE sapphire_three (`Projection` INTEGER, `2000` REAL, `2250` REAL, `2500` REAL, `2750` REAL, `3000` REAL, `3250` REAL, `3500` REAL, `3750` REAL, `4000` REAL,`option` TEXT)");
        sqLiteDatabase.execSQL("insert into sapphire_three Values(2000, 1696, 1777, 1858, 1940, 2021, 2102, 2183, 2264, 2345, 'standard')");
        sqLiteDatabase.execSQL("insert into sapphire_three Values(2250, 1755, 1841, 1928, 2013, 2099, 2185, 2271, 2357, 2444, 'standard')");
        sqLiteDatabase.execSQL("insert into sapphire_three Values(2500, 1814, 1905, 1996, 2087, 2178, 2269, 2360, 2451, 2542, 'standard')");
        sqLiteDatabase.execSQL("insert into sapphire_three Values(2750, 1873, 1969, 2065, 2161, 2257, 2353, 2449, 2545, 2641, 'standard')");
        sqLiteDatabase.execSQL("insert into sapphire_three Values(3000, 1932, 2033, 2134, 2235, 2336, 2437, 2537, 2638, 2739, 'standard')");
        sqLiteDatabase.execSQL("insert into sapphire_three Values(3250, 1992, 2097, 2203, 2308, 2415, null, null, null, null, 'standard')");
        sqLiteDatabase.execSQL("insert into sapphire_three Values(3500, 2050, 2161, 2272, 2382, 2493, null, null, null, null, 'standard')");

        //sliding_glass_3_2
        sqLiteDatabase.execSQL("CREATE TABLE sliding_glass_3_2 (`Projection` INTEGER, `1600` REAL, `1800` REAL, `2000` REAL, `2200` REAL, `2400` REAL,`option` TEXT)");
        sqLiteDatabase.execSQL("insert into sliding_glass_3_2 Values(1600, 854, 888, 923, 957, 992, 'standard')");
        sqLiteDatabase.execSQL("insert into sliding_glass_3_2 Values(1800, 883, 920, 958, 996, 1033, 'standard')");
        sqLiteDatabase.execSQL("insert into sliding_glass_3_2 Values(2000, 912, 953, 993, 1034, 1075, 'standard')");
        sqLiteDatabase.execSQL("insert into sliding_glass_3_2 Values(2200, 941, 985, 1029, 1073, 1116, 'standard')");
        sqLiteDatabase.execSQL("insert into sliding_glass_3_2 Values(2400, 971, 1018, 1064, 1111, 1158, 'standard')");
        sqLiteDatabase.execSQL("insert into sliding_glass_3_2 Values(2600, 1000, 1050, 1100, 1150, 1199, 'standard')");
        sqLiteDatabase.execSQL("insert into sliding_glass_3_2 Values(2800, 1029, 1082, 1135, 1188, 1241, 'standard')");

        //sliding_glass_3_3
        sqLiteDatabase.execSQL("CREATE TABLE sliding_glass_3_3 (`Projection` INTEGER, `2200` REAL, `2400` REAL, `2600` REAL, `2800` REAL, `3000` REAL, `3200` REAL, `3400` REAL, `3600` REAL,`option` TEXT)");
        sqLiteDatabase.execSQL("insert into sliding_glass_3_3 Values(1600, 1008, 1043, 1078, 1112, 1147, 1182, 1216, 1251, 'standard')");
        sqLiteDatabase.execSQL("insert into sliding_glass_3_3 Values(1800, 1048, 1086, 1123, 1161, 1199, 1237, 1274, 1312, 'standard')");
        sqLiteDatabase.execSQL("insert into sliding_glass_3_3 Values(2000, 1088, 1128, 1169, 1210, 1251, 1292, 1332, 1373, 'standard')");
        sqLiteDatabase.execSQL("insert into sliding_glass_3_3 Values(2200, 1127, 1171, 1215, 1259, 1303, 1347, 1391, 1434, 'standard')");
        sqLiteDatabase.execSQL("insert into sliding_glass_3_3 Values(2400, 1167, 1214, 1261, 1308, 1355, 1402, 1449, 1496, 'standard')");
        sqLiteDatabase.execSQL("insert into sliding_glass_3_3 Values(2600, 1207, 1257, 1307, 1357, 1407, 1457, 1507, 1557, 'standard')");
        sqLiteDatabase.execSQL("insert into sliding_glass_3_3 Values(2800, 1246, 1299, 1352, 1405, 1458, 1512, 1565, 1618, 'standard')");

        //sliding_glass_5_4
        sqLiteDatabase.execSQL("CREATE TABLE sliding_glass_5_4 (`Projection` INTEGER, `2800` REAL, `3000` REAL, `3200` REAL, `3400` REAL, `3600` REAL, `3800` REAL, `4000` REAL, `4200` REAL, `4400` REAL, `4600` REAL, `4800` REAL,`option` TEXT)");
        sqLiteDatabase.execSQL("insert into sliding_glass_5_4 Values(1600, 1211, 1249, 1287, 1325, 1364, 1402, 1440, 1478, 1516, 1554, 1593, 'standard')");
        sqLiteDatabase.execSQL("insert into sliding_glass_5_4 Values(1800, 1261, 1302, 1343, 1385, 1426, 1467, 1508, 1550, 1591, 1632, 1673, 'standard')");
        sqLiteDatabase.execSQL("insert into sliding_glass_5_4 Values(2000, 1311, 1355, 1399, 1444, 1488, 1532, 1577, 1621, 1665, 1710, 1754, 'standard')");
        sqLiteDatabase.execSQL("insert into sliding_glass_5_4 Values(2200, 1361, 1408, 1456, 1503, 1550, 1598, 1645, 1692, 1740, 1787, 1835, 'standard')");
        sqLiteDatabase.execSQL("insert into sliding_glass_5_4 Values(2400, 1411, 1461, 1512, 1562, 1613, 1663, 1713, 1764, 1814, 1865, 1915, 'standard')");
        sqLiteDatabase.execSQL("insert into sliding_glass_5_4 Values(2600, 1461, 1514, 1568, 1621, 1675, 1728, 1782, 1835, 1889, 1942, 1996, 'standard')");
        sqLiteDatabase.execSQL("insert into sliding_glass_5_4 Values(2800, 1511, 1567, 1624, 1680, 1737, 1794, 1850, 1907, 1963, 2020, 2077, 'standard')");

        //sliding_glass_5_5
        sqLiteDatabase.execSQL("CREATE TABLE sliding_glass_5_5 (`Projection` INTEGER, `2800` REAL, `3000` REAL, `3200` REAL, `3400` REAL, `3600` REAL, `3800` REAL, `4000` REAL, `4200` REAL, `4400` REAL, `4600` REAL, `4800` REAL, `5000` REAL, `5200` REAL, `5400` REAL, `5600` REAL, `5800` REAL, `6000` REAL,`option` TEXT)");
        sqLiteDatabase.execSQL("insert into sliding_glass_5_5 Values(1600, 1263, 1301, 1340, 1378, 1416, 1455, 1493, 1531, 1570, 1608, 1646, 1685, 1723, 1761, 1800, 1838, 1877, 'standard')");
        sqLiteDatabase.execSQL("insert into sliding_glass_5_5 Values(1800, 1314, 1355, 1397, 1438, 1480, 1521, 1562, 1604, 1645, 1687, 1728, 1770, 1811, 1852, 1894, 1935, 1977, 'standard')");
        sqLiteDatabase.execSQL("insert into sliding_glass_5_5 Values(2000, 1365, 1409, 1454, 1498, 1543, 1587, 1632, 1676, 1721, 1765, 1810, 1854, 1899, 1944, 1988, 2033, 2077, 'standard')");
        sqLiteDatabase.execSQL("insert into sliding_glass_5_5 Values(2200, 1416, 1464, 1511, 1559, 1606, 1654, 1701, 1749, 1797, 1844, 1892, 1939, 1987, 2035, 2082, 2130, 2177, 'standard')");
        sqLiteDatabase.execSQL("insert into sliding_glass_5_5 Values(2400, 1467, 1518, 1568, 1619, 1670, 1720, 1771, 1822, 1872, 1923, 1974, 2024, 2075, 2126, 2176, 2227, 2277, 'standard')");
        sqLiteDatabase.execSQL("insert into sliding_glass_5_5 Values(2600, 1518, 1572, 1626, 1679, 1733, 1787, 1841, 1894, 1948, 2002, 2055, 2109, 2163, 2217, 2270, 2324, 2378, 'standard')");
        sqLiteDatabase.execSQL("insert into sliding_glass_5_5 Values(2800, 1569, 1626, 1683, 1740, 1796, 1853, 1910, 1967, 2024, 2080, 2137, 2194, 2251, 2308, 2364, 2421, 2478, 'standard')");


















































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
            case "Vertex 150 Zip System":
                return "vertex";
            case "Sapphire Two Panels":
                return "sapphire_two";
            case "Sapphire Three Panels":
                return "sapphire_three";
            case "Sliding Glass 3rails 2panels":
                return "sliding_glass_3_2";
            case "Sliding Glass 3rails 3panels":
                return "sliding_glass_3_3";
            case "Sliding Glass 5rails 4panels":
                return "sliding_glass_5_4";
            case "Sliding Glass 5rails 5panels":
                return "sliding_glass_5_5";
            default:
                return Name;
        }
    }
}
