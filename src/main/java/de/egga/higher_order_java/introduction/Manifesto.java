package de.egga.higher_order_java.introduction;

import java.util.stream.Stream;

/**
 * @author egga
 */
public class Manifesto {

    static Stream<String> getSigners() {
        return Stream.of(
                "Doug Bradbury", "Corey Haines", "Paul Pagel", "Micah Martin", "Robert C. Martin", "David Chelimsky", "Ben Rady", "Paul Holser", "Derek Lane", "Greg Vaughn", "Mark Nijhof", "Tom McGraw", "Ryan Breidenbach",
                "Enrique Comba Riepenhausen", "Dave Hoover", "Colin Jones", "Eric Smith", "Antonio Terreno", "Matthew Segvich", "Kevin P. Taylor", "Olof Bjarnason", "Klaus Hebsgaard", "J. B. Rainsberger", "Zach Dennis",
                "Scott Pfister", "Rod Coffin", "Ron Jeffries", "Joseph Leddy", "Nate Jackson", "Denny Abraham", "Cory Foy", "Simone Busoli", "Michael Letterle", "Jason Gorman", "Gary Bernhardt", "Kelly S. French",
                "Renzo Borgatti", "Lance Ennen", "J.R. Garcia", "Curtis Cooley", "Jason Catena", "Derek Greer", "Isa Goksu", "Ian Suttle", "Liam McLennan", "David Dossot", "Thomas Vollmer", "Daniel Kaplan", "Bobby Johnson",
                "Erik G. H. Meade", "Shane Sholdice", "Brian Henderson", "Attila Domokos", "Thomas Pedersen", "Mike Vizdos", "Emilio Cavazos", "Brian Di Croce", "Bryan Helmkamp", "Robert Kerney", "Alessandro Pessotto",
                "Adolfo Sousa", "Dave Foley", "Maggie Longshore", "Jonathon Watney", "Andrew Peters", "Donald Belcham", "Dave Dribin", "Bob Vincent", "Jorn Olmheim", "Mark Needham", "Bil Kleb", "André M. Bonkowski",
                "Stephen Gyves", "Jason Meridth", "Christopher R. Gardner", "Mark Kola", "Antonio Cangiano", "Ben Mabey", "Surya Suravarapu", "Allen Ballman", "Chris Larson", "Kelly Leahy", "Jeff Doolittle",
                "David Chilcott", "Ryan Olshan", "Al Chou", "David Starr", "Matt Blodgett", "Stephan Linzner", "Sean Gao", "Kevin O'Neill", "James Thigpen", "Scott C Reynolds", "David Pokluda", "Craig Demyanovich",
                "Jason Pettys", "R. Eric Geiger", "François Perron", "Pete Johns", "Nathaniel Talbott", "Michael D. Hall", "Tony Geros", "Sai Venkatakrishnan", "Mary Poppendieck", "Scott Brown", "Chris Canal",
                "Marcos Barbosa", "Ryan Svihla", "T. Budiman", "Obie Fernandez", "Matthew Platte", "Ron Evans", "Andre John Cruz", "Robert Lewis", "Mike McKinney", "Jay Glynn", "Joey Beninghove", "Neil Robbins",
                "Sebastian Hermida", "Tim Wingfield", "Ravindar Gujral", "Shoshanah Bain", "Ariel Valentin", "Will Green", "Nick Ricketts", "Guillermo Salas", "Hemal Kuntawala", "Scott Moe", "Francesco Rizzi",
                ")Kevin McMahon", "Scott Williams", "Corey Reece", "Greg Young", "David Lay Medina", "Colin Wheeler", "Steve Horn", "Dale Merrick", "Adam Esterline", "Stephen Bohlen", "John Miller", "Adewale Oshineye",
                "Jesper Lind", "Mark VanderVoord", "Nayan Hajratwala", "Scott Koon", "Alex Hung", "Ron Hopper", "Michael Feathers", "Petar Kostadinov Shomov", "James Gregory", "Kent R. Spillner", "Andy Michaels",
                "Glenn Vanderburg", "Mark Grimes", "James Martin", "Shay Arnett", "Chris Bilson", "Julio Santos", "Goran Savovski", "Brian Cooke", "Cesar Tardaguila", "Aaron Weiker", "Scott Muc", "Michael L Perry",
                "Jean-Paul S. Boodhoo", "Curtis Gibeaut Jr.", "Joe Schneider", "Peter Ritchie", "Jeff McWherter", "Jonathan Birkholz", "Christopher Walzl", "Rasmus Bang Grouleff", "Anne Epstein", "Tom Opgenorth",
                "Brad Bell", "Kevin Gessner", "Justin Searls", "Robert Horvick", "Shane Jordan", "Brian Donahue", "Scott walker", "Darrin Holst", "Kevin Baribeau", "Caleb Cornman", "Maxime Rouiller", "Nate Klaiber",
                "Jeff Perrin", "Jacob Tomaw", "Zeljko Pavic", "P-M Larocque", "Matthew Podwysocki", "Steve Eichert", "Thiago Arrais", "Zach Shewmaker", "Jesse Read", "Mark Haskamp", "Joel Ross", "Joe Banks", "Justin Bozonier",
                "Kornelis Sietsma", "Adam Bair", "Manuel Vidaurre", "Craig Smith", "Jon Kern", "David White", "Zan Thrash", "Tim Ottinger", "Tyler Jennings", "Jean-François Roy", "Jeff Barnes", "Clayton Smith",
                "Richard Dingwall", "Rik Dryfoos", "James Suchy", "Timothy Maly", "Mishkin Berteig", "Rod Hilton", "Brian Graf", "Rock Hymas", "Stephen Mullins", "Matt Curtis", "Christopher Pritchard", "Ethan Gunderson",
                "Jake Scruggs", "Karen Smiley", "Gordon Hartley", "Garry Stewart", "Jeremy Mawson", "Mike Cohn", "Eric Gravert", "Robert Williams", "Evan David Light", "Ben Simo", "Grant Austin", "Jon Larkowski",
                "Leonard Chin", "Maudrit Martinez", "Eddy Pronk", "Tracy Harms", "Paul Rayner", "Tommy Morgan", "Pablo Rozanski", "Chris Hefley", "Sean Hussey", "Adib Motiwala", "Dave Astels", "Ryan L. Bell",
                "Raymond T. Hightower", "Matt Grommes", "Steve Donie", "Shannon Cornish", "Gregory Brown", "Jason Keats", "Jeff Schumacher", "Steven Casey", "Heinrich Breedt", "Mel Riffe", "John Wilger", "Daniel Elliott",
                "Dagfinn Reiersøl", "Dan Rough", "Jarkko Laine", "John Carney", "Chris Hedgate", "Ola Ellnestam", "Tormod Steinsholt", "Kerry Buckley", "Francesco Mondora", "Totto - Thor Henning Hetland", "Josh Price",
                "Bob Tulloch", "Krzysztof Koźmic", "Ian Turner", "Marc Johnson", "Jonas Bengtsson", "Forrest Chang", "Frank Vilhelmsen", "Kit Plummer", "Hadi Hariri", "Kevin Isom", "Alexander Snaps", "Olve Maudal",
                "Joakim Karlsson", "Jacky Li", "Marc Vangrieken", "Ivan Sanchez", "Bas Vodde", "Torbjørn Marø", "Marc Brooks", "James Ogden", "Joakim Sundén", "Tim Ross", "Joseph Wilk", "Martin Mazur", "Morten Haug",
                "Aleksandar Radulovic", "Stéphane Tavera", "Robert Matthews", "Knut Urdalen", "Kazi Manzur Rashid", "Iain Holder", "Nuno Marques", "Phil Bennett", "Marek Tihkan", "Torbjörn Gyllebring", "Christian B. Hauknes",
                "Stefan Roock", "Arnold Zokas", "Nikola Solev", "David Laing", "Marty Andrews", "Sebastian Sanitz", "Øyvind Fanebust", "Markus Gärtner", "Kerry Jones", "Daniel Brolund", "Timothy Parez", "Michael Hart",
                "Grant Goodale", "Michael Dubakov", "Marcin Białoń", "Chris McGrath", "Keith Pope", "Thomas Sundberg", "Robert Postill", "Nils Christian Haugen", "Chris Karr", "Damon Morgan", "Sebastian Hörner",
                "Luis Barragan", "Paul Wilson", "Luke Amdor", "João Guilherme Lourenço dos Santos", "Gavin Bong", "David W. Body", "Dennis Traub", "Christian Blunden", "Aaron Erickson", "Bård Strøm", "Luis Abreu",
                "Andy Palmer", "Markus Zywitza", "Eric-Alexander Schäfer", "Christoph Thelen", "John Hwang", "Jonathan Penn", "Domenico Musto", "Oliver Lohmann", "Aaron Bedra", "Rishi Chopra", "TJ Stankus", "Dean Wampler",
                "Rudy De Coninck", "Matthew Larkowski", "Andrew Woodward", "Steen Lehmann", "Simon Kirk", "Jose Manuel Beas", ")Lisamarie Babik", ")Morgan Cheng", "Patrick McMichael", "Matt Van Vleet", "Russell Giddings",
                "Morgan Persson", "Charles Hoffman", "Thomas Rodgers", "Michelangelo Altamore", "Christiano Milfont", "Simone Chiaretta", "Michał Brzozowski", "Colin Gemmell", "Jon Arild Tørresdal", "Thiago Pradi",
                "Matthew Otto", "Michael Furtak", "Tim Andersen", "Joshua Graham", "Doug Ramsay", "Jeremy Anderson", "Hamlet D'Arcy", "Magnus Green", "Rebecca Wirfs-Brock", "Chris Brooks", "Franz Allan Valencia See",
                "Michael Iantosca", "Matt Wynne", "Dave Sherohman", "Ravi Varanasi", "Kirstin Juhl", "Jijesh Mohan", "Weston M. Binford III", "Bryan Cook", "Nick Parker", "John A. Smith", "Dennis E. Hamilton", "Kasper Frank",
                "Jamie Macey", "Aaron Jensen", "Damon Ronco", "Mike Finney", "Pierre-Antoine Grégoire", "Micheal McCoy", "Kevin Faustino", "Nicholas Kostelnik", "Charley Baker", "Gregory Jackson", "Aaron Freeman",
                "Kimhin Jing", "Roger Marlow", "Brian H. Ward", "James W Grenning", "Keith Bennett", "Rasmus Kromann-Larsen", "Stefan Dobrev", "Takuto Wada", "Willem van den Ende", "James Brechtel", "Matthew D Edwards",
                "Romilly Cocking", "Nathan Pledger", "Stephan Schmidt", "Hank Roark", "Forrest Humphrey", "Juha Ristolainen", "Bjarte Karlsen", "Chirag Dadia", "Michael Wilson", "Jim Ginn", "Omar Qadan", "Jørgen Larsen",
                "Chris Nelson", "C.J. Anderson", "Thomas Ferris Nicolaisen", "Fredrik Kalseth", "Chad Gorshing", "Rob Bazinet", "Matt Yoho", "Federico Boerr", "Kory Wnuk", "Javier Lozano", "Erlend Oftedal", "Mark Thomas",
                "Emanuele Vulcano", "Scott Isaacs", "Ryan Hoegg", "Darrel Miller", "Paulo Arancibia", "Toran Billups", "Scott Roth", "Kacper Ryniec", "Rob Bowley", "Zac Harlan", "Vincenzo Acinapura", "Joe Ocampo", "John Wood",
                "Robert Thurnher", "Martin Kühl", "Debasish Ghosh", "Jim Argeropoulos", "Fabio Nascimento", "Troy Tuttle", "James Edward Gray II", "Scott Saad", "Kev Hunter", "Daniel Davis", "Eric Seijo", "Vidar Kongsli",
                "Koji Shimada", "Stefano Paluello", "Chris Sims", "Sammy Larbi", "David Gageot", "Greg Jahnke", "Joe Chavez", "Derik Whittaker", "Marcus Irven", "Francisco Treacy", "Goutam Dey", "Harald Nesland",
                "Wilkes Joiner", "Michelle Winkel", "Edmund Tay", "Rodolfo de Paula", "Matt Brewer", "Daniel Mohl", "John Stoneham", "Michael Tutty", "Mando Escamilla", "Daniel Gill", "Dave'the ninja' Lawton",
                "Terje Sandstrom", "Andreas Havenstein", "Fabrizio G. Ventola", "Josh King", "Eric Williams", "Glenn Dixon", "Nate Kohari", "Frank Wierzbicki", "John Bailey", "Johnny G. Halife", "Bobby Wilson", "Jooyung Han",
                "Brandon Carlson", "Kiran Subbaraman", "Guðlaugur Stefán Egilsson", "Damian Mehers", "Cormac D. McCarty", "Joe O'Pecko", "Johannes Brodwall", "Mark Van Holstyn", "Yoshi Carroll", "Peter Henriksen",
                "Jeremy D. Frens", "Raul H. Macias", "Eduardo Scoz", "Mohamed Saleh", "Sune Simonsen", "Carl Hume", "Jeffrey Diercks", "Sheheryar Sewani", "Piergiuliano Bossi", "raj rajmohan", "Emad Alashi", "areej Abukar",
                "Caike Souza", "Kjetil Klaussen", "Matt Sellars", "Salvatore Sanfilippo", "Raimondi Aronne", "Richard Egan", "Oliver Gierke", "Niko Felger", "Matt Polito", "Chet Hendrickson", "Nadeem Bitar", "Harper Trow",
                "Christian Guimarães", "Tareq Salah", "Thomas Hübertz", "Hugo Baraúna", "Jason L. Stanis", "Maarten Leo Daalder", "Nick Nguyen", "omar muwahed", "J C Lawrence", "Paco Wensveen"
        );
    }
}
