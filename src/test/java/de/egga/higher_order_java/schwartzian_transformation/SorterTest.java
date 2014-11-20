package de.egga.higher_order_java.schwartzian_transformation;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.assertThat;

public class SorterTest {

    private Sorter sorter = new Sorter();

    @Test
    public void shouldName() {
        List<Species> allOfEm = allOfEm().stream().map(Species::new).collect(toList());
        sorter.naive(allOfEm);
        assertThat(allOfEm.get(0).getName()).isEqualTo("ASas");
    }

    public List<String> allOfEm() {
        return asList(
                "Adipose‎", "Gond‎", "Ice Warriors‎", "Individual Euterpians‎", "Judoon‎", "Kaleds‎", "Karagulans", "Karfelons‎", "Minyans or Minyan descendants‎", "Neanderthals‎", "Ogrons‎", "Ood‎", "Osirians‎", "Phrynians‎", "Silurians and Sea Devils‎", "Sontarans‎", "Thals‎", "Trakenites‎", "Werewolves‎", "Zygons‎", "", "2", "Species 29", "7", "Species 7", "Humanoid", "Abzorbalovian", "Adipose", "Aeolian", "Agrovan",
                "Akker", "Alien Ambassador's species", "Alzarian", "Amazastian", "Androgum", "Anethan", "Angvian", "Annarene", "Antarian", "Anubian", "Anuran", "Apalapucian", "Aplan", "Arbitan (species)", "Arcateenian", "Archetryxian", "Argolin", "Aridian", "Arldan", "Artificial", "Asek", "Atrion", "Badger pirate", "Bajunx", "Balhoonian", "Ballustran", "Bandril", "Baroque", "Bask", "Bernustan",
                "Betrushian (mammal)", "Betrushian (reptile)", "Blowfish", "Boor", "Brascan", "Bruydac", "Bukolian", "Cantryan", "Carrionite", "Castrovalvan", "Cat-Person", "Caxtarid", "Chameleon (humanoid)", "Charnel", "Charonid", "Cheetah Person", "Chelonian", "Chimeron", "Chlorian", "Chukwa Fel Interrogators", "Cimmerian", "Cleaning creature", "Clockworks", "Cogenian", "Crallican",
                "Creature (The Monsters of Coal Hill School)", "Crespallion (species)", "Crinothian", "Cro-Magnon", "Cryon", "Cun", "Cyberman", "Cythosi", "Dai-ai", "The Dead", "Deltan", "Demoniac", "Dethak", "Dido person", "Diplosian", "Disciples of the Light", "Meta-Crisis Tenth Doctor", "Dogon", "Doradan", "Draconian", "Drahvin", "Drashani", "Drast", "Drebnarian", "Dreekan", "Dreilyn",
                "Drornidian", "Dulcian", "Dzu-teh", "Dæmon", "Elder", "Elystrian", "Emorgan", "Equinan", "Equinoid", "Eternal", "Ethereal", "Etydion", "Eutermesan", "Euterpian", "Exxilon (species)", "Eyeless", "Fairy", "Farrian", "Fatkat", "Felinoid", "Ferutu", "First humanoid", "Fishman", "Fleshkind", "Flisk", "Floof", "Fomoir", "Futurekind", "Galapogan", "Galathos", "Galk", "Gallifreyan", "Galyari",
                "Ganger", "Gantac", "Garynth", "Gastronaut", "Gavin's father's species", "Gaztak", "Gelezen (species)", "Gelth", "Geomyde", "Ghosty", "Githian", "Gizou", "Glacian", "Gnaa", "Golem (The Beast of Orlok)", "Goll", "Gond", "Gorolox", "Graske", "Graxnix", "Grel", "Grey alien", "Grold", "Groske", "Gråttite", "Hath", "Hervoken", "Hoix", "Hooloovoo", "Horsegoon", "Human",
                "Human-Time Lord Meta-Crisis", "Humanoid Dalek", "Hunter", "Hyban", "Icthal", "Igris", "Inter Minorian", "Jacondan", "Jadean", "Jaftee", "Jagaroth", "Jamarian", "Jand (species)", "Jeillo", "Jekkari", "Jixen", "Judoon", "Kaark", "Kahler (species)", "Kalarian", "Kaled", "Kandalath", "Kantrian", "Karagulan", "Karfelon", "Karturan", "Kastrian", "Katurian", "Kchrusivour", "Kephra",
                "Keshkali", "Khellian", "Khthon", "Killoran", "Kinda", "Kirithon", "Klade", "Klathi", "Klepton", "Klingon", "Klondite", "Korad", "Korven", "Koturian", "Kraal", "Krattorian", "Krontep (species)", "Kulan", "Kzinti", "Lakertyan", "Lakhotha", "Layloran", "Lepscillian", "Levithian", "Linkton", "Lion-man", "Lizard King", "Logopolitan", "Loligo", "Lords of Althrace", "Lucidean",
                "Lugal-Irra-Kush", "Lurker", "Lurman", "Malmooth", "Manussan", "Marshman", "Master Race", "Meron", "Metalkind", "Migarian", "Mih-teh", "Minotaur (species)", "Mogarian", "Molag", "Mondasian", "Monoid", "Monstron", "Morestran", "Morok", "Morraxian", "Mute", "Muto", "Navarino", "Neanderthal", "Nedenah", "Never-were", "Nimon", "Nishtubi", "Nostrovite", "Oblivioner", "Ogron", "Olympian",
                "Ondrockan", "Oolian", "Osirian", "Pan-Babylonian", "Panjistri", "Paragrolli", "Peladonian", "Perfecton (species)", "Persopolisian", "Pescaton", "Petrolion", "Phiadoran", "Phobovore", "Phrynian", "Plasmavore", "Polar-creature", "Posadian", "Primord", "Prin", "Proamonian", "Pyrovile", "Qetesh", "Rakkonoid", "Ratling", "Raxacoricofallapatorian", "Remoraxian", "Reptilodon", "Rhumon",
                "Ribosian", "Rigelian", "Rigellan", "Rocarbies", "Ronan", "Rostrow", "Rygerian", "Ryosian", "Saraani", "Sarriflex", "Sceadu", "Schirr", "Scrollnée", "Sea Devil", "Sea Devil (Mondasian)", "Segonaxian", "Sehkmet", "Sensorite", "Shakri", "Shansheeth", "Shard", "Shasarak", "Shik", "Sidhe (Cat's Cradle: Witch Mark)", "Silent", "Silent person", "Sirian", "Skirkon", "Skith", "Skonnan",
                "Skullion", "Slaken", "Slithergee", "Solarian (Embrace the Darkness)", "Solonian", "Soul Pirate", "Space Greyhound", "Space Leech", "Spiridon (species)", "Sunless", "Svelnan", "Swampie", "Sycorax", "Technix", "Telphin", "Terileptil", "Terraberserker", "Terradonian", "Tetrap", "Thain", "Thal", "Thanaxon", "Therovian", "Thoros Alphan", "Threllip", "Throxillian", "Tibari",
                "Tibetan Yeti", "Tigellan", "Time Lord", "Tingha", "Titanthrope", "Tivolian", "Tormian Toad-man", "Tonska", "Tragellan", "Tralsammavarian", "Tree of Cheem", "Tregannon", "Tribe of the Three Valleys", "Trion (species)", "Triskele", "Trit", "Tritovore", "True Lord", "Tryod", "Tulk", "Tyrryxian", "Tytheg", "Tzun", "Ugrakk", "Ukkan", "Ulian", "Ultramancer", "Unit (species)",
                "Unnamed alien (The Door to a Winter Long Ago)", "Unnamed species (Planet Bollywood)", "Unnamed species (Rise and Fall)", "Unnamed species (The Doctor, the Widow and the Wardrobe)", "Untra", "Urbankan", "Ursine", "Uvodni", "Uxariean", "V'orrn", "Vagan", "Valeron", "Valnaxi", "Great Vampire", "Vampire", "Vampire Warrior", "Vardan", "Vegan (The Monster of Peladon)", "Veil",
                "Velderon", "Velgor", "Veltrochni", "Velyshaan", "Venusian (Voyage to Venus)", "Vigil", "Vinvocci", "Viperox", "Vishklar", "Viyran", "Vladlack", "Vogan (Revenge of the Cybermen)", "Vogan (The Vogan Slaves)", "Voord", "Vredosian", "Vulcan (species)", "War Lord", "Waro", "Water Hag", "Weeping Angel", "Weevil", "Whisper Man", "Wildren", "Witiku", "Word Lord", "Xantha", "Xeron", "Xhinn",
                "Xlanthi", "Xragoni", "XXltttxtolxtol", "Xyz", "Yend", "Yeti Traversii", "Zaan", "Zagbor", "Zantraan", "Zeld", "Zenith", "Zentra", "Zeon", "Zerovian", "Zocci", "Zoltan", "Zonian", "Zygon");
    }
}