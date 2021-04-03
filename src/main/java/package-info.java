/*
 * Singleton:   не применён - напрашивался FileReader как самый грязный. Если бы у него был бы метод на запись, то так
 * бы и сделал чтобы исключить кейс когда один экземпляр меняет файл, а второй его читает. Но он назван Reader, из чего
 * понимаю что писать он ничего никогда не будет. Сомнения возникли насчет scanner, но кажется что если метод со сканером
 * параллельно будет исполнятся то не произойдёт ничего страшного?
 * Factory:     применён - все генераторы тут по факту простые фабрики и итнерфейс для них есть)
 * Builder:     не применён - мы принимаем один параметр для генерации данных, вот если бы набор входных параметров был
 * бы вариативным, вот тут бы да, а так простых фабрик достаточно
 * Adapter:     применён - чтобы генератор ФИО не перепиливать обернул его в генератор ДТО.
 * Bridge:      применён - у человека HAS фио, физические данные и остальные там всякие шутки
 * Facade:      применён - ну, у нас тут и фабрика перосны вроде как за фасадом, наружу принимают цифру,
 * возвращают готовый объект, а что там они уже под капотом что там происходит можно не вникать.
 * DTO:         применён - фамилию, имя и отчество мы не будем использовать раздельно, поэтому нет смысла ни возвращать
 * их по одному, не принимать.
 * Шаблон:      не применён - ну, тут у нас один алгоритм.
 * Декотратор: обернул генератор номера телефона декоратором чтобы палиндромы отсекались
 */