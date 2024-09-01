import java.util.ArrayList;
import java.util.List;

public class Folder implements IFolderSystemComponent{
	private String name;
	private List<ISystemComponent> list = new ArrayList<>();
	
	public Folder(String name)
	{
		this.name = name;
	}
	
	@Override
	public void showDetail() {
		System.out.println(name);
		for(ISystemComponent comp : list)
		{
			comp.showDetail();
		}
	}

	@Override
	public void add(ISystemComponent component) {
		list.add(component);
	}

	@Override
	public void remove(ISystemComponent component) {
		list.remove(component);
	}

	@Override
	public ISystemComponent getChild(int i) {
		return list.get(i);
	}

}
