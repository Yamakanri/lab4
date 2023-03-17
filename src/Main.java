import Actors.*;
import Enums.*;
import Event.Event;
import Exceptions.PersonHasNotNameException;
import Exceptions.PersonIsTooOldException;
import Location.Town;

public class Main {

    public static void main(String[] args) throws PersonHasNotNameException, PersonIsTooOldException {
        try {

            Town stockholm = new Town("Стокгольм ", " красивый");
            Town.Flat kidFlat = new Town.Flat("Квартира малыша", 6, 5);
            Human carlson = new Human("Карлсон", 55, EnergyLevel.HIGH);
            carlson.propeller.getOwner();
            Human kid = new Human("Малыш", 12, EnergyLevel.MEDIUM);

            carlson.complain(kid, " у него " + EmotionalCondition.INSOMNIA);
            kid.teach(carlson, " что делать с " + EmotionalCondition.INSOMNIA);
            kid.count("Нужно считать" + AnimalType.SHEEP, " которые прыгают через ", Place.FENCE);
            kid.emotion(EmotionalCondition.LAUGH);

            Event giftTest = new Event("испытание ");
            carlson.toDo(" захотел провести " + giftTest.getEventName(), Item.GIFT);
            kid.say(null, carlson, " " + EmotionalCondition.DETERMINED);
            carlson.toDo(" пожал плечами ", null);
            kid.emotion(EmotionalCondition.STUBBORN);
            kid.toDo(" не соглашался на " + giftTest.getEventName(), Item.PISTOL);
            carlson.emotion(EmotionalCondition.IDEA);

            Event lackOfPie = new Event(" отсутсвовал " + Food.PIE);
            Event.getEventLocation(kidFlat, lackOfPie.getEventName());
            carlson.emotion(EmotionalCondition.GROUCHINESS);
            kid.calm(carlson);
            kid.say(null, carlson, ": 'пустяки, дело житейское'");
            kid.move(null, Place.ROOM, Place.KITCHEN);

            Human mum = new Human("Мама", 35, EnergyLevel.LOW);

            mum.allowing(carlson, " разрешила давать " + Food.BUNS + " ");
            mum.notAllowing(kid, carlson, " не разрешает ", " летать с ", Place.ROOF);
            kid.emotion(EmotionalCondition.FORGETFULNESS);
            mum.remembering(kid, "том, что ему нельзя летать на крышу");
            kid.emotion(EmotionalCondition.SURPRISE);
            kid.feel(EmotionalCondition.FEARLESSNESS, " не боиться летать, ", "он привык, ", "сердце не екает");
            carlson.propeller.abilityToFly(carlson);
            carlson.carry(kid, Place.HOME, Place.ROOFTOP_HOUSE);

            Event evenings = new Event("Красивые июльские вечера");
            Event birthday = new Event("День рождения Карлсона");
            Event.getEventLocation(stockholm, evenings.getEventName());
            Event.getEventDetails(evenings.getEventName(), " нужны, чтобы праздновать ", birthday.getEventName() + " в ", null, Place.ROOFTOP_HOUSE);
            Event.getEventDetails("Таких" + evenings.getEventName(), " когда " + Place.SKY + " светиться особым светом, ", "когда сумерки яркие, прозрачные и синие, ", "что город и небо кажутся сказочными, нет ", Place.NOWHERE);
            kid.see(" любовался ", Place.SKY);
            carlson.emotion(EmotionalCondition.CARELESS);

            carlson.sit(" на ", Place.ROOF);
            kid.sit(" на ", Place.ROOF);
            kid.eat(carlson, " уплетали и пили ", Food.BUNS, Food.JUICE);
            kid.emotion(EmotionalCondition.REALIZATION);

            kid.compare("вечер", "другие вечера");

            carlson.emotion(EmotionalCondition.REALIZATION);
            carlson.compare("булочки", "другие булочки");

            kid.compare(Place.ROOFTOP_HOUSE + "", "другие " + Place.ROOFTOP_HOUSE);

            kid.emotion(EmotionalCondition.MISUNDERSTANDING);
            carlson.storage(Item.TREASURES, Place.WALL);
            carlson.paint(Item.PICTURES, "и повесил их на ", Place.WALL);
            kid.toDo(" любил смотреть на ", Item.PICTURES);

            Human.getObjectDescribe(Item.PICTURES, " 'Очень одинокий " + AnimalType.ROOSTER + "'", " на ней нарисована: " + AnimalType.LITTLEBIRD);
            Human.getObjectDescribe(Item.PICTURES, " 'Портрет моих " + AnimalType.RABBIT + "'", " на ней нарисована: " + AnimalType.FOX);

            carlson.eat(null, " набил рот ", Food.BUNS, null);
            carlson.say(null, kid, " что–то ");
            kid.communication(" не слушал ", carlson);
            kid.emotion(EmotionalCondition.DIZZINESS);
            kid.smell("летнего вечера");
            kid.emotion(EmotionalCondition.DISTRACTION);
            kid.smell(" цветущих лип");
            kid.listen("стук каблуков");
            Event sunnyEvening = new Event("Ясный вечер");
            Event.getEventDetails("В " + sunnyEvening.getEventName(), " много людей гуляло на  ", null, null, Place.SIDEWALK);
            kid.emotion(EmotionalCondition.THOUGHT);
            kid.think("'Какой летний звук!'");
            Event quietEvening = new Event("Тихий вечер");
            Event.getEventDetails("Был " + quietEvening.getEventName(), ", каждый звук доносился отчетливо с ", null, null, Place.STREET);
            Event.getEventDetails("В этот " + quietEvening.getEventName(), " все боолтали,", " кричали и пели,", " бранились и смеялись на ", Place.STREET);
            kid.listen("сплетение звуков, будто музыку");
            kid.emotion(EmotionalCondition.HAPPY);
            kid.think("'Нет, они не знают, что я сижу здесь с " + carlson.getName() + ", и что мне так хорошо, и что я жую" + Food.BUNS + " и пью " + Food.JUICE + "'");


            Thieves fille = new Thieves("Филле", 32, EnergyLevel.HIGH);
            Thieves rulle = new Thieves("Рулле", 31, EnergyLevel.HIGH);

            Thieves.shout(fille, rulle, Place.ATTIC);
            Thieves.fame(fille, rulle, " самые известные хулиганы и воры ", Place.VAZASTAN);
            Thieves.comparatorWithAnimal(fille, rulle, AnimalType.MAGPIE);
            Thieves.steal(fille, rulle, "все что увидели");
            carlson.joke(fille, rulle);
            Thieves.rob(fille, rulle, Place.FLAT_SVANTSEN);
            carlson.frighten(fille, rulle);
            carlson.listen("вопли " + fille.getName() + " и " + rulle.getName());
            carlson.move(kid, Place.ROOF, Place.ATTIC);
            kid.emotion(EmotionalCondition.SURPRISE);
            kid.think("как можно так прыгать на коротких ногах");
            kid.toDo(" старался не отстать", null);

            Event openWindow = new Event(Place.WINDOW + " было открыто ");
            Event.getEventDetails(openWindow.getEventName(), "но, было занавешено занавесками на ", null, null, Place.ATTIC);
            Place.getPlaceDetails(Place.ATTIC, " стоял сильный крик");
            kid.emotion(EmotionalCondition.REALIZATION);
            kid.emotion(EmotionalCondition.FEAR);
            carlson.emotion(EmotionalCondition.LAUGH);

            Event shooting = new Event("Выстрелы");
            Event.getEventDetails(shooting.getEventName(), " громко прозвучали на ", null, null, Place.ROOF);
            Thieves.action(fille, rulle, " вскочили");

            kid.think(" 'Рулле, нас нет' ");
            carlson.move(kid, Place.ATTIC, Place.PORCH);
            kid.emotion(EmotionalCondition.DISTRACTION);
            Thieves.danger(fille, rulle, carlson);

            Human frekken = new Human("Фреккен", 65, EnergyLevel.MEDIUM);
            Human julius = new Human("Джулиус", 99, EnergyLevel.LOW);

            kid.think("Забыл рассказать " + carlson.getName() + " о " + frekken.getName() + " и " + julius.getName());
            carlson.toDo(" не слушал ", null);
            carlson.eat(null, " уплетал ", Food.BUNS, null);
            carlson.eat(null, " пил из " + Item.GLASS + " ", Food.JUICE, null);
            carlson.drink(" как маленький ребенок ");
            carlson.takeOff(Item.BOTS, " показал пальцы ног");

        } catch (PersonHasNotNameException e) {
            System.out.println(e.getMessage());
        }

    }
    }
