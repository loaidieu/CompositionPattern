
public class File implements IFileSystemComponent{
	private String name;
	
	public File(String name)
	{
		this.name = name;
	}
	
	@Override
	public void showDetail() {
		System.out.println(name);
	}

}
