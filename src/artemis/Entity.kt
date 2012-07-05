package artemis

public class Entity(world : World, id : Int){
    private var id : Int = id
    private var uniqueId : Long = 0
    private var typeBits : Long = 0
    private var systemBits : Long = 0

    private var world : World = world
    private var entityManager : EntityManager

    {
        entityManager = world.getEntityManager()
    }

    public fun getId() : Int{
        return id
    }

    protected fun setUniqueId(uniqueId : Long){
        this.uniqueId = uniqueId
    }

    public fun getUniqueId() : Long{
        return uniqueId
    }

    protected fun getTypedBits() : Long{
        return typeBits
    }
}