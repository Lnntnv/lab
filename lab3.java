// класс Dog
public class DogTestDrive {

    public static void main(String [] args) {
        Dog one = new Dog();
        one.size = 70;
        Dog two = new Dog();
        two.size = 8;
        Dog three = new Dog();
        three.size = 35;

        one.bark();
        two.bark();
        three.bark();
    }
}
}
        // бумажные деньги
        Money choice = new Money();
        switch(choice.type){
        case VEB:
        System.out.println("Венесуэльский боливар - основная денежная единица Венисуэлы");
        break;
        case ARS:
        System.out.println("Аргентинское песо в 1992 году заменило аустраль");
        break;
        case VUV:
        System.out.println("Вату- национальная валюта Республики Вануату");
        break;
        case HUF:
        System.out.println("Название Форинт происходит от названия города Флоренция");
        break;
        case HNL:
        System.out.println("Лемпира - денежная единица Республики Гондурас");
        break;
        case MNT:
        System.out.println("Тугрик - семантическая калька китайского слова юань");
        break;}

        }

class M{
    MTypes type;
    M  (){
        System.out.println("1.Боливар\n2.Песо\n3.Вату\n4.Форинт\n5.Лемпира\n6.Тугрик");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        switch (i){
            case 1:
                this.type=MoneyTypes.VEB;
                break;
            case 2:
                this.type=MoneyTypes.ARS;
                break;
            case 3:
                this.type=MoneyTypes.VUV;
                break;
            case 4:
                this.type=MoneyTypes.HUF;
                break;
            case 5:
                this.type=MoneyTypes.HNL;
                break;
            case 6:
                this.type=MoneyTypes.MNT;
                break;

        }
    }
}

enum MTypes {
    VEB, ARS, VUV, HUF, HNL, MNT

}