package com.yuch.ngeresep

object DataMasakan{
    private val llNama = arrayOf(
        "Telur Balado",
        "Lodeh Kacang Panjang dan Tempe",
        "Orak-arik Telur Toge Baso",
        "Sambal Terong Kacang Panjang",
        "Tumis Daun Singkong",
        "Orek Tempe Tahu",
        "Mujaer Goreng Tempe",
        "Balado Ikan Sarden dan Jengkol",
        "Lumpia Basah Tanpa Sambal",
        "Nasi Kuning Simpel"
    )
    private val llFoto = intArrayOf(
        R.drawable.telur_balado,
        R.drawable.lodeh_kacang_panjang_dan_tempe,
        R.drawable.orak_arik_telur_toge_baso,
        R.drawable.sambal_terong_kacang_panjang,
        R.drawable.tumis_daun_singkong,
        R.drawable.orek_tempe_tahu,
        R.drawable.mujaer_goreng_sambal_terasi,
        R.drawable.balado_ikan_sarden_dan_jengkol,
        R.drawable.lumpia_basah_bandung_rumahan_tanpa_saos_oles,
        R.drawable.nasi_kuning
    )
    private val llBahan = arrayOf(
        arrayOf("8 butir telur", "4 lembar daun jeruk", "1 batang daun bawang cincang kasar", "Minyak goreng secukupnya"),
        arrayOf("1/4 kacang panjang", "1 papan tempe ukuran kecil", "Cabe kriting","Jahe, sereh, daun salam", "kunyit", "1 sachet kara 65ml/santan"),
        arrayOf("1 buah terong ungu", "6 helai kacang panjang"),
        arrayOf("1 ikat daun singkong","Cabe kriting","Cabe rawit (sesuai selera)"),
        arrayOf("1 papan kecil tempe (+- 350 g), iris dadu 1 cm", "4 buah tahu, iris dadu", "50 ml air", "2 lembar daun salam", "1/2 sdt kaldu jamur (optional, kalau mau lebih gurih)", "Utk penggemar pedas, bisa tambah rawit merah, ga usah nyambel lg"),
        arrayOf("1/2 Kg ikan mujaer", "Minyak Goreng", "150 Gr Cabe Rawit", "3 Buah Cabe merah besar", "1 Buah Tomat", "1 Papan Tempe", "1 Kotak Tahu", "2 Buah Labu Jepang (siam/manisa)", "1 ikat Kemangi"),
        arrayOf("4-5 ikan sarden ukuran sedang", "10 buah jengkol, kupas, belah dua dan rendam air, sisihkan", "Kaldu bubuk (optional)", "Minyak untuk menggoreng"),
        arrayOf("1 plastik toge beli di pasar", "2 batang daun bawang", "1 butir telur ayam", "1 sdt saus tiram", "1/2 sdt penyedap", "1/2 sdt lada bubuk", "1/2 sdt gula", "secukupnya Bawang bombay (optional)", "Topping sesuai selera bisa sosis, bakso, dll"),
        arrayOf("Beras (sesuai selera)", "1 butir Air santan kelapa")
    )
    private val llBumbu = arrayOf(
        arrayOf("8 siung bawang merah","4 siung bawang putih", "10 cabai keriting", "5 cabai rawit (bisa ditambah sesuai selera)", "1 ruas jari kunyit", "Secukupnya garam, gula dan penyedap masakan"),
        arrayOf("5 bawang merah", "2 bawah putih", "3 kemiri"),
        arrayOf("4 butir bawang merah (iris)", "2 cabe merah keriting (sesuai selera) iris", "1 cabe hijau (sesuai selera) iris", "2 siung bawang putih (iris)","secukupnya Garam, merica, gula dan penyedap rasa", "secukupnya Saus tiram dan kecap manis"),
        arrayOf("4 bawang merah", "4 cabe merah keriting", "3 bawang putih", "Kencur", "1 buah Tomat", "7 cabe rawit (sesuai selera)", "Penyedap rasa", "Garam"),
        arrayOf("3 Bawang merah","1 Bawang putih","Gula, garam, penyedap rasa, merica bubuk"),
        arrayOf("5 buah cabe merah, iris serong", "3 buah cabe hijau besar, iris 1 cm", "5 buah bawang merah, iris tipis", "3 siung bawang putih, iris tipis", "4 cm lengkuas, memarkan","3 sdm kecap manis", "1 sdt gula (kalo lagi ngurangi gula, diskip, kecapnya jadi 4 sdm)", "1/2 sdt garam/ secukupnya"),
        arrayOf("6 Siung Bawang Putih", "1 bungkus Terasi Bakar", "1 Keping Gula Merah", "4 Siung Bawang Merah", "1 Sdm Kunyit Bubuk", "1 Sdm Ketumbar Bubuk", "1 Sdt Garam (+ secukupnya)"),
        arrayOf("1 buah tomat ukuran kecil", "6 siung bawang merah", "2 siung bawang putih", "20-25 cabe merah keriting", "20 cabe rawit kecil", "secukupnya Garam", "secukupnya Gula"),
        arrayOf("4 siung bawang merah","2 siung bawang putih","1 buah cabe merah kriting","1 buah cabe rawit (sesuai selera)"),
        arrayOf("3 siung Bawang putih", "3 butir Kunyit", "Daun salam", "Daun jeruk", "Daun sereh")
    )
    private val llLangkah = arrayOf(
        arrayOf("Rebus telur hingga matang kemudian goreng telur yang telah direbus dan kupas,","Haluskan bumbu,","Siapkan wajan kemudian tumis bumbu. Tambahkan daun jeruk masak bumbu hingga matang dan harum,", "Tambahkan sedikit air dan Masak hingga mendidih,","Masukkan telur ke dalam bumbu tambahkan daun bawang dan aduk rata,","Masak telur hingga bumbu cukup asap kemudian koreksi rasa,","Telur bumbu balado yang telah matang, siap disajikan."),
        arrayOf("Potong tempe kemudian goreng. Setelah matang angkat dan tiriskan", "Potong kacang panjang,", "Haluskan Bawang merah, bawang putih, kemiri,","Iris cabe kriting","Tumis bumbu halus sampai harum, masukan jahe, sereh yang sudah digeprek, daun salam dan cabe kriting","Masukan kacang panjang, aduk sampai bumbu merata dan sedikit layu. Kemudian tambahkan air","Tambahkan gula, garam, penyedap rasa, merica bubuk, kunyit bubuk, dan ketumbar bubuk,","Kalau air sudah mulai mendidih, tambahkan sunkara/santan dan masukan tempe,","Masak sampai matang, koreksi rasa","Sajikan, makan selagi masih hangat :D"),
        arrayOf("Tumis bumbu yang sudah diiris sampai harum","Kemudian orak-arik telur, masukan baso dan toge lalu aduk kembali","Tambahkan garam, penyedap rasa, merica dan gula kemudian aduk sampai merata","Tambahkan saus tiram dan kecap manis","Koreksi rasa dan masak sampai matang","Tumis toge baso telur siap disajikan ^_^"),
        arrayOf("Potong terong dan kacang panjang. Cuci bersih","Kemudian goreng terong dan kacang panjang terpisah sampai layu","Haluskan bawang merah, bawang putih, kencur, tomat, cabe merah kriting dan cabe rawit setelah halus tambahkan garam dan penyedap rasa","Tumis bumbu halus sampai harum dan matang, kemudian masukan terong dan kacang panjang","Aduk sampai tercampur dengan sambal","Angkat dan sajikan"),
        arrayOf("Rebus daun singkong sampai layu, kemudian angkat dan tiriskan","Iris bawang merah, Bawang putih, cabe kriting dan cabe rawit. Kemudian tumis sampai harum","Masukan daun singkong, tambahkan sedikit air","Masukan garam, gula dan penyedap rasa","Koreksi rasa"),
        arrayOf("Goreng tempe dan tahu setengah matang. Sisihkan.","Panaskan minyak goreng, tumis bawang putih hingga kekuningan. Baru masukkan bawang merah, tumis hingga layu","Masukkan cabe merah, cabe hijau, salam dan lengkuas, tumis sampai wangi salam lengkuas keluar","Masukkan air, kecap, gula, garam, kaldu. Aduk sampai mendidih. Test rasa","Masukkan tempe dan tahu, aduk2 sampai air mengering. Sajikan."),
        arrayOf("Cuci bersih ikan.. Buang kotoran perutnya, potong jadi 2 (sesuai selera), Uleg halus semua bumbu ikan balurkan ke ikan tunggu 15 menit, goreng sampai matang","Potong tahu tempe sesuai selera, Goreng sampai matang.. Kupas labu Jepang potong sesuai selera cuci bersih lalu rebus hingga matang sisihkan.. Cuci daun kemangi pisahkan daun dari tangkainya sisihkan","Cuci semua bahan kecuali terasi dan gula merah.. Goreng hingga layu.. Uleg sambal sampai halus tambahkan garam terasi dan gula merah uleg sebentar campur dengan kemangi..","Sajikan\uD83C\uDF7D"),
        arrayOf("Bersihkan ikan dan cuci bersih, beri sedikit garam dan kucuri dengan jeruk nipis agar tidak amis, sisihkan","Panaskan minyak, lalu goreng jengkol yg telah direndam air bersih tadi, goreng hingga matang, lalu jengkolnya digeprak sedikit","Goreng ikan hingga matang","Blender Halus tomat, bawang merah dan bawang putih, berikan sedikit minyak dan sedikit garam saat memblender, setelah halus masukkan cabai merah dan cabai rawit, blender sebentar saja agar tekstur cabai tidak terlalu halus","Panaskan minyak lalu tumis cabai yg sudah diblender tadi hingga minyak naik, dan kecilkan api, masukkan gula, garam, kaldu bubuk, koreksi rasa","Jika dirasa sudah pas, dan sambal sudah matang dan tidak bau mentah, masukkan ikan dan jengkol tadi, aduk rata, sajikan"),
        arrayOf("Cuci bersih toge dan daun bawang dengan air mengalir","Haluskan semua bumbu saya pakai chopper mini","Potong bawang bombay kotak kotak","Tumis bumbu yang sudah di haluskan, masukkan irisan bawang bombay. Goreng sampai wangi","Setelah bumbu halus wangi, pinggirkan samping wajan. Lalu masukkan telur lalu orak arik, tambahkan topping (optional)","Masukkan toge, dan perbumbuan (saus tiram, penyedap, lada, gula sedikit)","Koreksi rasa, sambil masukkan potongan daun bawang","Kalau sudah dirasa pas. Tinggal platting siapkan kulit lumpia taruh diatasnya. Selesai."),
        arrayOf("Tumbuk halus bawang putih dan kunyit","Lalu di masak dahulu kita tumis, beri daun salam daun jeruk dan geprek sereh agar tidak bau langu","Setelah tercium harum, masukan santan kelapa. Lalu aduk2 tunggu bbrpa menit","Masukan ke dlm beras yg sudah di cuci","Tunggu bbrpa menit sampai nasi kuning nya matang, lalu siap di sajikan","Isian topping di sesuaikan saja dngn selera masing2 yah")
    )
    private val llDeskripsiSingkat = arrayOf(
        "Telur Balado adalah hidangan tradisional Indonesia yang terkenal dengan rasa pedas dan nikmatnya.",
        "Lodeh Kacang Panjang dan Tempe adalah hidangan sayuran dengan bumbu santan yang lezat.",
        "Orak-arik Telur Toge Baso adalah hidangan telur dengan campuran tauge dan bakso, sangat cocok sebagai menu sarapan.",
        "Sambal Terong Kacang Panjang adalah sambal pedas dengan bahan utama terong dan kacang panjang, sangat cocok untuk pelengkap makanan.",
        "Tumis Daun Singkong adalah hidangan sayuran yang segar dan lezat, cocok untuk menu sehari-hari.",
        "Orek Tempe Tahu adalah hidangan tempe dan tahu yang diolah dengan bumbu yang kaya rasa.",
        "Mujaer Goreng Tempe adalah hidangan ikan goreng disajikan dengan tempe goreng dan sambal terasi.",
        "Balado Ikan Sarden dan Jengkol adalah hidangan ikan sarden dan jengkol yang diolah dengan bumbu balado khas Indonesia.",
        "Lumpia Basah Tanpa Sambal adalah hidangan lumpia dengan isian sayuran dan daging, disajikan dengan kuah kental tanpa sambal.",
        "Nasi Kuning Simpel adalah hidangan nasi kuning yang disajikan dengan pelengkap seperti telur, ayam goreng, dan kerupuk."
    )

    val listData : ArrayList<Masakan>
        get() {
            val list = arrayListOf<Masakan>()
            for (position in llNama.indices){
                val data = Masakan()
                data.nama = llNama[position]
                data.foto = llFoto[position]
                if (position < llBahan.size) data.bahan = llBahan[position]
                if (position < llBumbu.size) data.bumbu = llBumbu[position]
                if (position < llLangkah.size) data.langkah = llLangkah[position]
                data.deskripsiSingkat = llDeskripsiSingkat[position]
                list.add(data)
            }
            return list
        }
}