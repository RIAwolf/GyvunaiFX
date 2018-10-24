# GyvunaiFX

## Užduotis
Sukurti JavaFX programą. Programa automatiškai nuskaito failą, suformuoja gyvūnus ir paklausia vartotojo kurį gyvūną parodyti. Kai vartotojas įveda pasirinkimą pateikiama visa gyvūno informacija bei iškviečiamas jo judėjimo veiksmas.

## Duomenų failo aprašymas
faile yra duomenys apie įvairius gyvūnus. 
```
dog mammal Bobikas 3.5 0.5 walk
cat mammal Silvestras 1.9 0.35 sneak
pigeon bird Tveetty 0.1 0.05 fly
```

## Architektūra:
* Kiekvienas gyvūnas paveldi iš klasės **Animal**. 
* Panaudoti **Factory** pattern suformuoti gyvūno objektui. 
* Panaudoti **Scanner** nuskaitant informaciją iš failo.
* Panaudoti **MVC** design pattern visos programos pagrindu
* Panaudoti **Facade** design pattern pagrindinėje klasėje.
* Duomenis laikyti **Singleton** pattern paremtoje klasėje.
* Duomenų objektai turi būti laikomi sąraše.
* Vengti switch/case!!!


## Reikalavimai programiniam kodui:
* Visas kodas turi sekti Java naming convention.
* Programinį kodą laikyti GitHub saugykloje.
* Dirbant su git panaudoti branch ir merge, kad būtų matoma GitHub puslapyje.
* Baigus nupiešti UML klasių diagramą su Google Draw ir pridėti vaizdą į GitHub readme dalį.
* Nupiešti UX diagramą
