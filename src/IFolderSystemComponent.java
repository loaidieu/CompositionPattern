
public interface IFolderSystemComponent extends ISystemComponent{
	public void add(ISystemComponent file);
	public void remove(ISystemComponent file);
	public ISystemComponent getChild(int i);
	public void showDetail();
}
