/**
 * Этот класс представляет собой один шаг в пути, сгенерированном a* pathfinding
 * алгоритм. Путевые точки состоят из местоположения, предыдущей путевой точки в пути
 * и некоторых значений затрат, используемых для определения наилучшего пути.
 **/

public class Waypoint {
    /** Расположение этой путевой точки **/
    Location loc;

    /**
     Предыдущая путевая точка в этом пути или < code>null< / code>, если это
     * корень поиска а*.
     **/
    Waypoint prevWaypoint;

    /**
     * В этом поле хранится общая предыдущая стоимость получения от начала
     *  расположение к этой путевой точке через цепочку путевых точек. Это
     *  фактическая стоимость следования по пути; она не включает в себя никаких оценок.
     **/
    private float prevCost;

    /**
     * В этом поле хранится оценка оставшейся стоимости поездки из
     *  это путевая точка до конечного пункта назначения.
     **/
    private float remainingCost;


    /**
     * Постройте новую путевую точку для указанного местоположения. От предыдущей точки
     * может быть дополнительно задано, или ссылка может быть <code>null< / code>, чтобы
     * указать, что путевая точка является началом пути.
     **/
    public Waypoint(Location loc, Waypoint prevWaypoint)
    {
        this.loc = loc;
        this.prevWaypoint = prevWaypoint;
    }

    /** Возвращает местоположение путевой точки. **/
    public Location getLocation()
    {
        return loc;
    }

    /**
     * Возвращает предыдущую путевую точку в пути или < code>null< / code>, если это
     * это начало пути.
     **/
    public Waypoint getPrevious()
    {
        return prevWaypoint;
    }

    /**
     * Этот метод позволяет установить как предыдущую стоимость, так и оставшуюся стоимость
     * за один вызов метода. Обычно эти значения будут установлены на одном и том же уровне
     *  во всяком случае, время.
     **/
    public void setCosts(float prevCost, float remainingCost)
    {
        this.prevCost = prevCost;
        this.remainingCost = remainingCost;
    }

    /**
     * Возвращает фактическую стоимость достижения этой точки с самого начала
     * местоположение, через ряд путевых точек в этой цепочке.
     **/
    public float getPreviousCost()
    {
        return prevCost;
    }

    /**
     * Возвращает оценку оставшейся стоимости поездки от этого
     * укажите конечный пункт назначения.
     **/
    public float getRemainingCost()
    {
        return remainingCost;
    }

    /**
     * Возвращает общую смету затрат для этой путевой точки. Это включает в себя
     * фактические затраты на то, чтобы добраться до этой точки из исходного места, плюс
     * оценка оставшейся стоимости путешествия от этой точки до конечного пункта
     назначения.
     **/
    public float getTotalCost()
    {
        return prevCost + remainingCost;
    }
}