package ToursTravel;

import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {

        Login ref = new validUser();
        ref.login();

        System.out.println(" ");
        System.out.println("SELECT YOUR LOCATION");
        System.out.println(" 1: Manali");
        System.out.println(" 2: Leh Ladakh");
        System.out.println(" 3: Coorg");
        System.out.println(" 4: Andaman");
        System.out.println(" 5: Lakshadweep");
        System.out.println(" 6: Goa");
        System.out.println(" 7: Udaipur");
        System.out.println(" 8: Srinagar");
        System.out.println(" 9: Gangtok");
        System.out.println("10: Munnar");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println(">>>> Manali Tourist spots");
                System.out.println("");
                System.out.println("1: Solang Valley");
                System.out.println("2: Old Manali");
                System.out.println("3: Jogini Waterfall");
                System.out.println("4: Rohtang Pass");
                n = sc.nextInt();
                switch (n) {
                    case 1:
                        System.out.println(" ");
                        sv a = new sv("Solang Valley", "manali", "Buddist", "Oct-Jun", 5000);
                        System.out.println(a.p_name);
                        System.out.println(a.p_city);
                        System.out.println(a.p_culture);
                        System.out.println(a.p_month);
                        System.out.println(a.p_price);
                        break;

                    case 2:
                        System.out.println("");
                        om o = new om("Old Manali", "manali", "Buddist", "Oct-Jun", 5000);
                        System.out.println(o.p_name);
                        System.out.println(o.p_city);
                        System.out.println(o.p_culture);
                        System.out.println(o.p_month);
                        System.out.println(o.p_price);
                        break;

                    case 3:
                        System.out.println("");
                        jw j = new jw("Jogini Waterfall", "manali", "Buddist", "Oct-Jun", 5000);
                        System.out.println(j.p_name);
                        System.out.println(j.p_city);
                        System.out.println(j.p_culture);
                        System.out.println(j.p_month);
                        System.out.println(j.p_price);
                        break;

                    case 4:
                        System.out.println("");
                        rp r = new rp("Rohtang Pass", "manali", "Buddist", "Oct-Jun", 5000);
                        System.out.println(r.p_name);
                        System.out.println(r.p_city);
                        System.out.println(r.p_culture);
                        System.out.println(r.p_month);
                        System.out.println(r.p_price);
                        break;
                }
                break;

            case 2:
                System.out.println(">>>> Leh Ladak Tourist spots");
                System.out.println("");
                System.out.println("1: Pangong Lake");
                System.out.println("2: Khardung La");
                System.out.println("3: Sangam");
                System.out.println("4: Nubra Valley");
                n = sc.nextInt();
                switch (n) {
                    case 1:
                        System.out.println("");
                        pl p = new pl("Pangong Lake", "Leh Ladakh", "NA", "Any", 13499);
                        System.out.println(p.p_name);
                        System.out.println(p.p_city);
                        System.out.println(p.p_culture);
                        System.out.println(p.p_month);
                        System.out.println(p.p_price);
                        break;

                    case 2:
                        System.out.println("");
                        kl k = new kl("Khardung La", "Leh Ladakh",
                                "There is limited network connectivity in the region Lack of proper medical facility. So, carry a basic first-aid kit The closest petrol pumps are located in Leh and Nubra Valley Acclimatise for high altitude mountain sickness",
                                "5359 metres", 13499);
                        System.out.println(k.p_name);
                        System.out.println(k.p_city);
                        System.out.println(k.p_culture);
                        System.out.println(k.p_month);
                        System.out.println(k.p_price);
                        break;

                    case 3:
                        System.out.println("");
                        sg ss = new sg("Sangam", "Leh Ladakh", "NA", "Any", 13499);
                        System.out.println(ss.p_name);
                        System.out.println(ss.p_city);
                        System.out.println(ss.p_culture);
                        System.out.println(ss.p_month);
                        System.out.println(ss.p_price);
                        break;

                    case 4:
                        System.out.println("");
                        nv nn = new nv("Nubra Valley", "Leh Ladakh", "NA", "Any", 13499);
                        System.out.println(nn.p_name);
                        System.out.println(nn.p_city);
                        System.out.println(nn.p_culture);
                        System.out.println(nn.p_month);
                        System.out.println(nn.p_price);
                        break;
                }
                break;

            case 3:
                System.out.println(">>>> Coorg Tourist spots");
                System.out.println("");
                System.out.println("1: Abbey Falls");
                System.out.println("2: Rajas Seat");
                System.out.println("3: Golden Temple (Namdroling Monastery)");
                System.out.println("4: Tadiandamol Peak");
                n = sc.nextInt();
                switch (n) {
                    case 1:
                        System.out.println("");
                        af ff = new af("Abbey Falls", "Karnataka", "NA", "Any", 13499);
                        System.out.println(ff.p_name);
                        System.out.println(ff.p_city);
                        System.out.println(ff.p_culture);
                        System.out.println(ff.p_month);
                        System.out.println(ff.p_price);
                        break;

                    case 2:
                        System.out.println("");
                        rs rr = new rs("Rajas Seat", "Karnataka",
                                "Garden: 5:30 AM - 7:30 PM, Musical Fountain: Weekdays - 7:00 PM onwards, Weekends - 6:45 PM - 7:20 PM",
                                "5359 metres", 13499);
                        System.out.println(rr.p_name);
                        System.out.println(rr.p_city);
                        System.out.println(rr.p_culture);
                        System.out.println(rr.p_month);
                        System.out.println(rr.p_price);
                        break;

                    case 3:
                        System.out.println("");
                        gt gg = new gt("Golden Temple (Namdroling Monastery)", "Karnataka", "NA", "Any", 899);
                        System.out.println(gg.p_name);
                        System.out.println(gg.p_city);
                        System.out.println(gg.p_culture);
                        System.out.println(gg.p_month);
                        System.out.println(gg.p_price);
                        break;

                    case 4:
                        System.out.println("");
                        tp tt = new tp("Tadiandamol Peak", "Karnataka", "NA",
                                " Moderate. Not recommended for amateurs. ", 699);
                        System.out.println(tt.p_name);
                        System.out.println(tt.p_city);
                        System.out.println(tt.p_culture);
                        System.out.println(tt.p_month);
                        System.out.println(tt.p_price);
                        break;
                }
                break;

            case 4:
                System.out.println(">>>> Andaman Tourist spots");
                System.out.println("");
                System.out.println("1: Cellular Jail");
                System.out.println("2: Elephant Beach");
                System.out.println("3: Neil Island");
                System.out.println("4: Baratang Island");
                n = sc.nextInt();
                switch (n) {
                    case 1:
                        System.out.println("");
                        af ff = new af("Cellular Jail", "Union Teratory(Port Blair)", "NA",
                                "he cellular Jail is located within the city of Port Blair. The best way to reach the jail complex is by hiring your own private cab as the public transport in Andaman isn't well developed. Else, you can also take an auto-rickshaw to reach your destination.",
                                13499);
                        System.out.println(ff.p_name);
                        System.out.println(ff.p_city);
                        System.out.println(ff.p_culture);
                        System.out.println(ff.p_month);
                        System.out.println(ff.p_price);
                        break;

                    case 2:
                        System.out.println("");
                        rs rr = new rs("Elephant Beach", "Union Teratory",
                                "The beach is open for day trips between 9-4. if you're planning to do adventure sports visit in between 10 AM -2 PM. The beach closes at 4 PM",
                                "5359 metres", 499);
                        System.out.println(rr.p_name);
                        System.out.println(rr.p_city);
                        System.out.println(rr.p_culture);
                        System.out.println(rr.p_month);
                        System.out.println(rr.p_price);
                        break;

                    case 3:
                        System.out.println("");
                        gt gg = new gt("Neil Island", "Union Teratory",
                                "Neil Island is a part of the South Andaman Administrative District and belongs to Ritchie’s Archipelago in the Bay of Bengal",
                                "Any", 599);
                        System.out.println(gg.p_name);
                        System.out.println(gg.p_city);
                        System.out.println(gg.p_culture);
                        System.out.println(gg.p_month);
                        System.out.println(gg.p_price);
                        break;

                    case 4:
                        System.out.println("");
                        tp tt = new tp("Baratang Island", "Union Teratory",
                                "Popular activities at the Batarang Island include boating through the mangrove forests and limestone caves, untouched beaches, light treks and hikes and bird watching.",
                                " ANY ", 299);
                        System.out.println(tt.p_name);
                        System.out.println(tt.p_city);
                        System.out.println(tt.p_culture);
                        System.out.println(tt.p_month);
                        System.out.println(tt.p_price);
                        break;
                }
                break;

            case 5:
                System.out.println(">>>> Lakshadweep Tourist spots");
                System.out.println("");
                System.out.println("1: Minicoy Island");
                System.out.println("2: Agatti Islands");
                System.out.println("3: Bangaram Island");
                System.out.println("4: Kavaratti Islands");
                n = sc.nextInt();
                switch (n) {
                    case 1:
                        System.out.println(" ");
                        sv a = new sv("Minicoy Island", "Lakshadweep Islands",
                                "One of the 36 small islets of Lakshadweep group of Islands, Minicoy, also known as Maliku in the local language is one of the best-kept secrets of India. It is located amidst the vast expanse of Arabian Sea, just 398 km or 215 nautical miles from the shores of Cochin",
                                "ALL YEAR", 0);
                        System.out.println(a.p_name);
                        System.out.println(a.p_city);
                        System.out.println(a.p_culture);
                        System.out.println(a.p_month);
                        System.out.println(a.p_price);
                        break;

                    case 2:
                        System.out.println("");
                        om o = new om("Agatti Islands", "Lakshadweep Islands",
                                "Agatti Islands is considered another jewel from the Lakshadweep group of islands in India. The island is situated on one of the coral isles of Lakshadweep islands and is few of the islands from the Lakshadweep group that is inhabited by people",
                                "Oct-Jun", 0);
                        System.out.println(o.p_name);
                        System.out.println(o.p_city);
                        System.out.println(o.p_culture);
                        System.out.println(o.p_month);
                        System.out.println(o.p_price);
                        break;

                    case 3:
                        System.out.println("");
                        jw j = new jw("Bangaram Island", "Lakshadweep Islands",
                                "Bangaram Island is a beautiful tiny island in the Union Territory of Lakshadweep, India. The Bangaram Island encompasses an area of 1.234 km2 and is the largest island in the chain of islands in the region",
                                "Oct-Jun", 0);
                        System.out.println(j.p_name);
                        System.out.println(j.p_city);
                        System.out.println(j.p_culture);
                        System.out.println(j.p_month);
                        System.out.println(j.p_price);
                        break;

                    case 4:
                        System.out.println("");
                        rp r = new rp("Kavaratti Islands", "Lakshadweep Islands",
                                "Kavaratti is a small island spread across an area of 3.93 sqm km and one of the most beautiful gems from the Lakshadweep islands. The island is home to 12 atolls, five submerged banks, and three coral reefs. The spectacular views of the Arabian sea, the sparkling white-sand beaches offer solace amidst the tranquil nature.",
                                "Oct-Jun", 0);
                        System.out.println(r.p_name);
                        System.out.println(r.p_city);
                        System.out.println(r.p_culture);
                        System.out.println(r.p_month);
                        System.out.println(r.p_price);
                        break;
                }
                break;

            case 6:
                System.out.println(">>>> Goa Tourist spots");
                System.out.println("");
                System.out.println("1: Calangute Beach");
                System.out.println("2: Fort Aguada");
                System.out.println("3: Cruise in Goa");
                System.out.println("4: Dudhsagar Falls");
                n = sc.nextInt();
                switch (n) {
                    case 1:
                        System.out.println(" ");
                        sv a = new sv("Calangute Beach", "North Goa",
                                "Jet Ski: INR 300 for a ride without a professional rider along  Banana Ride: INR 450 per person Parasailing: INR 1000 (including boating+parachute)",
                                "Oct-Jun", 5000);
                        System.out.println(a.p_name);
                        System.out.println(a.p_city);
                        System.out.println(a.p_culture);
                        System.out.println(a.p_month);
                        System.out.println(a.p_price);
                        break;

                    case 2:
                        System.out.println("");
                        om o = new om("Fort Aguada", "North Goa",
                                "The Lighthouse, Aguada Jail, Experience the sunset, Church of St Lawrence", "Oct-Jun",
                                299);
                        System.out.println(o.p_name);
                        System.out.println(o.p_city);
                        System.out.println(o.p_culture);
                        System.out.println(o.p_month);
                        System.out.println(o.p_price);
                        break;

                    case 3:
                        System.out.println("");
                        jw j = new jw("Cruise in Goa", "Goa", "Varies according to the cruise type and package chosen",
                                "Oct-Jun", 6000);
                        System.out.println(j.p_name);
                        System.out.println(j.p_city);
                        System.out.println(j.p_culture);
                        System.out.println(j.p_month);
                        System.out.println(j.p_price);
                        break;

                    case 4:
                        System.out.println("");
                        rp r = new rp("Dudhsagar Falls", "South Goa", "6 - 7 Hours to Trek", "ANY", 150);
                        System.out.println(r.p_name);
                        System.out.println(r.p_city);
                        System.out.println(r.p_culture);
                        System.out.println(r.p_month);
                        System.out.println(r.p_price);
                        break;
                }
                break;

            case 7:
                System.out.println(">>>> Udaiput Tourist spots");
                System.out.println("");
                System.out.println("1: City Palace, Udaipur");
                System.out.println("2: Lake Pichola");
                System.out.println("3: Bagore Ki Haveli");
                System.out.println("4: Eklingji Temple");
                n = sc.nextInt();
                switch (n) {
                    case 1:
                        System.out.println(" ");
                        sv a = new sv("City Palace, Udaipur", "Rajasthan",
                                "Adult (Above 18 years) INR 300, Child INR 100, Student INR 100", "NA", 0);
                        System.out.println(a.p_name);
                        System.out.println(a.p_city);
                        System.out.println(a.p_culture);
                        System.out.println(a.p_month);
                        System.out.println(a.p_price);
                        break;

                    case 2:
                        System.out.println("");
                        om o = new om("Lake Pichola", "Rajasthan",
                                "The Lake Pichola is an artificial lake located in the heart of Udaipur, Rajasthan. The oldest and one of the largest lakes of the city, the Lake Pichola observes lakhs of tourists because of its tranquillity and beauty.",
                                "NA", 0);
                        System.out.println(o.p_name);
                        System.out.println(o.p_city);
                        System.out.println(o.p_culture);
                        System.out.println(o.p_month);
                        System.out.println(o.p_price);
                        break;

                    case 3:
                        System.out.println("");
                        jw j = new jw("Bagore Ki Haveli", "Rajasthan",
                                "Situated in the Gangaur Ghat Marg of Udaipur in the state of Rajasthan, Bagore ki Haveli is an opulent gracious palace which was built in the eighteenth century on the waterfront of Lake Pichola.",
                                "NA", 0);
                        System.out.println(j.p_name);
                        System.out.println(j.p_city);
                        System.out.println(j.p_culture);
                        System.out.println(j.p_month);
                        System.out.println(j.p_price);
                        break;

                    case 4:
                        System.out.println("");
                        rp r = new rp("Eklingji Temple", "Rajasthan",
                                "Eklingji Temple is one of the most popular temples of Rajasthan and is sited at a distance of 22 km to the north of Udaipur",
                                "Oct-Jun", 0);
                        System.out.println(r.p_name);
                        System.out.println(r.p_city);
                        System.out.println(r.p_culture);
                        System.out.println(r.p_month);
                        System.out.println(r.p_price);
                        break;
                }
                break;

            case 8:
                System.out.println(">>>> Srinagar Tourist spots");
                System.out.println("");
                System.out.println("1: Dal Lake");
                System.out.println("2: Shankaracharya Temple");
                System.out.println("3: Indira Gandhi Memorial Tulip Garden");
                System.out.println("4: Shalimar Bagh");
                n = sc.nextInt();
                switch (n) {
                    case 1:
                        System.out.println(" ");
                        sv a = new sv("Dal Lake", "Jammu And Kashmir",
                                "The Jewel of Srinagar, the Dal Lake is synonymous to a visit to Srinagar and is almost a visual definition of the town",
                                "ALL", 0);
                        System.out.println(a.p_name);
                        System.out.println(a.p_city);
                        System.out.println(a.p_culture);
                        System.out.println(a.p_month);
                        System.out.println(a.p_price);
                        break;

                    case 2:
                        System.out.println("");
                        om o = new om("Shankaracharya Temple", "Jammu And Kashmir",
                                "The Shankaracharya Temple in Srinagar, located on top of the Shankaracharya Hill, is dedicated to Lord Shiva and is one of the oldest shrines in Kashmir. Also known as Jyesteshwara Temple,",
                                "Oct-Jun", 0);
                        System.out.println(o.p_name);
                        System.out.println(o.p_city);
                        System.out.println(o.p_culture);
                        System.out.println(o.p_month);
                        System.out.println(o.p_price);
                        break;

                    case 3:
                        System.out.println("");
                        jw j = new jw("Indira Gandhi Memorial Tulip Garden", "Jammu And Kashmir",
                                "Indira Gandhi Memorial Tulip Garden is the largest tulip garden in Asia which is set in the foothills of the Zabarwan mountain range in Srinagar. Formerly known as Model Floriculture Center, it overlooks the mesmerising Dal Lake.",
                                "Oct-Jun", 25);
                        System.out.println(j.p_name);
                        System.out.println(j.p_city);
                        System.out.println(j.p_culture);
                        System.out.println(j.p_month);
                        System.out.println(j.p_price);
                        break;

                    case 4:
                        System.out.println("");
                        rp r = new rp("Shalimar Bagh", "Jammu And Kashmir",
                                "Shalimar Bagh is a beautifully laid out Mughal garden, the largest of the three Mughal gardens in Srinagar ",
                                "ALL", 10);
                        System.out.println(r.p_name);
                        System.out.println(r.p_city);
                        System.out.println(r.p_culture);
                        System.out.println(r.p_month);
                        System.out.println(r.p_price);
                        break;
                }
                break;

            case 9:
                System.out.println(">>>> Gangtok Tourist spots");
                System.out.println("");
                System.out.println("1: Nathula Pass");
                System.out.println("2: Rumtek Monastery");
                System.out.println("3: Tsomgo Lake");
                System.out.println("4: Namgyal Institute of Tibetology");
                n = sc.nextInt();
                switch (n) {
                    case 1:
                        System.out.println(" ");
                        sv a = new sv("Nathula Pass", "Sikkim",
                                "Nathula, one of the highest motorable roads in the world, is a mountain pass in the Himalayan peaks that co-joins Sikkim and China",
                                "Oct", 0);
                        System.out.println(a.p_name);
                        System.out.println(a.p_city);
                        System.out.println(a.p_culture);
                        System.out.println(a.p_month);
                        System.out.println(a.p_price);
                        break;

                    case 2:
                        System.out.println("");
                        om o = new om("Rumtek Monastery", "Sikkim",
                                "The Rumtek Monastery is one of the largest and most significant monasteries in Sikkim, perched on top of a hill 23 km from Gangtok",
                                "Winters", 0);
                        System.out.println(o.p_name);
                        System.out.println(o.p_city);
                        System.out.println(o.p_culture);
                        System.out.println(o.p_month);
                        System.out.println(o.p_price);
                        break;

                    case 3:
                        System.out.println("");
                        jw j = new jw("Tsomgo Lake", "Sikkim",
                                "Perched between the mountains at a dizzying height of 12400 ft above sea level, the Tsomgo Lake is one of the few high-altitude lakes in India situated on the Gangtok",
                                "Jan", 0);
                        System.out.println(j.p_name);
                        System.out.println(j.p_city);
                        System.out.println(j.p_culture);
                        System.out.println(j.p_month);
                        System.out.println(j.p_price);
                        break;

                    case 4:
                        System.out.println("");
                        rp r = new rp("Namgyal Institute of Tibetology", "Sikkim",
                                "One of the very few of its kind, Namgyal Institute of Tibetology is an abode of centuries-old Tibetan-Buddhist culture and its history.",
                                "Oct-Jun", 0);
                        System.out.println(r.p_name);
                        System.out.println(r.p_city);
                        System.out.println(r.p_culture);
                        System.out.println(r.p_month);
                        System.out.println(r.p_price);
                        break;
                }
                break;

            case 10:
                System.out.println(">>>> Munnar Tourist spots");
                System.out.println("");
                System.out.println("1: Munnar Tea Plantations");
                System.out.println("2: Atukkad Waterfalls");
                System.out.println("3: Pothamedu View Point");
                System.out.println("4: Mattupetty Dam");
                n = sc.nextInt();
                switch (n) {
                    case 1:
                        System.out.println(" ");
                        sv a = new sv("Munnar Tea Plantations", "Kerala",
                                "Perched at several feet over the sea level and boasting of misty skies above and green carpeted fields below, these splendid Tea gardens in Munnar ",
                                "Oct-Jun", 5000);
                        System.out.println(a.p_name);
                        System.out.println(a.p_city);
                        System.out.println(a.p_culture);
                        System.out.println(a.p_month);
                        System.out.println(a.p_price);
                        break;

                    case 2:
                        System.out.println("");
                        om o = new om("Atukkad Waterfalls", "Kerala",
                                "Nestled 2 km away from Munnar amidst beautiful hills and lush green jungles, this pristine waterfall makes for romantic escapades and picnics site",
                                "ALL", 6999);
                        System.out.println(o.p_name);
                        System.out.println(o.p_city);
                        System.out.println(o.p_culture);
                        System.out.println(o.p_month);
                        System.out.println(o.p_price);
                        break;

                    case 3:
                        System.out.println("");
                        jw j = new jw("Pothamedu View Point", "Kerala",
                                "Pothamedu View Point, situated 5 km off Munnar, is adorned with stretching hills and lush green mountains.",
                                "Oct-Jun", 3000);
                        System.out.println(j.p_name);
                        System.out.println(j.p_city);
                        System.out.println(j.p_culture);
                        System.out.println(j.p_month);
                        System.out.println(j.p_price);
                        break;

                    case 4:
                        System.out.println("");
                        rp r = new rp("Mattupetty Dam", "Kerala",
                                "Mattupetty Dam is a strong gravity dam which was constructed for power generation and water conservation.",
                                "Oct-Jun", 150);
                        System.out.println(r.p_name);
                        System.out.println(r.p_city);
                        System.out.println(r.p_culture);
                        System.out.println(r.p_month);
                        System.out.println(r.p_price);
                        break;
                }
                break;

        }
        sc.close();
    }

}
