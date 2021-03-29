
public class User implements Cloneable{
int id;
String name;

public User( String name, int id)
{
	this.id=id;
	this.name=name;
}

@Override
public boolean equals(Object obj)
{
	if(this == obj)
		return true;
	
	if(obj==null || obj.getClass()!=this.getClass())
	    return false;
	
	User user = (User) obj;
	
	return (user.name.equals(this.name) && (user.id==this.id));
}

@Override
public int hashCode()
{
	return this.id;
}
@Override
public String toString()
{
	return ""+hashCode();
}

protected Object clone() throws CloneNotSupportedException
{
return super.clone();	
}

}
