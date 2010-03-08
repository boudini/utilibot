import java.awt.Rectangle;
import org.xvolks.jnative.JNative;
import org.xvolks.jnative.Type;
import org.xvolks.jnative.exceptions.NativeException;
import org.xvolks.jnative.pointers.Pointer;
import org.xvolks.jnative.pointers.memory.MemoryBlockFactory;

public class TableIdentifier
{
  private static final String DLL_NAME = "User32.dll"; 
  private static final String FIND_WINDOW_METHOD= "FindWindowA";
  private static final String GET_WINDOW_RECTANGLE = "GetWindowRect";
  private String mClassName, mTableName;

  public TableIdentifier(String className, String tableName)
  {
    this.mClassName = className;
    this.mTableName = tableName;
  }
  
  public Rectangle getWindowRectangle() throws NativeException, IllegalAccessException
  {
    JNative findAWindow = new JNative(DLL_NAME, FIND_WINDOW_METHOD);
    findAWindow.setRetVal(Type.INT);
    findAWindow.setParameter(0,Type.STRING, mClassName);
    findAWindow.setParameter(1,Type.STRING, mTableName);
    findAWindow.invoke();

    String handle = findAWindow.getRetVal();
    Pointer p = new Pointer(MemoryBlockFactory.createMemoryBlock(16));

    JNative getWindowRect = new JNative(DLL_NAME, GET_WINDOW_RECTANGLE);
    getWindowRect.setRetVal(Type.INT);
    getWindowRect.setParameter(0,Type.INT,handle);
    getWindowRect.setParameter(1,p);
    getWindowRect.invoke();

    int left = p.getAsInt(0);
    int top = p.getAsInt(4);
    int right = p.getAsInt(8);
    int bottom = p.getAsInt(12);

    Rectangle r = new Rectangle(left,top,right - left,bottom - top);

    return r;
  }
}