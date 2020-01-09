package lanqiao;/*
 * 电路布线问题
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Circuit
{
	class Cell
	{
		private int row;
		private int col;
		private Cell from;

		/*
		 * 定义一个方格元素,
		 * row表示方格的行号
		 * col表示方格的列号
		 * from表示此方格的前驱方格
		 */
		public Cell(int row, int col, Cell from)
		{
			this.row = row;
			this.col = col;
			this.from = from;
		}
	}
	//maze数组存放迷宫内部状态，#表示此方格不通，A为起点，B为终点
	//.表示此方格可行
	char[][] circuit =
			{{'#','#','#','#','.','#','#','#','#','#','#','#'},
					{'#','#','#','#','.','.','.','.','#','#','#','#'},
					{'#','#','#','#','.','#','#','#','#','.','.','#'},
					{'#','.','.','E','.','#','#','#','#','#','.','#'},
					{'#','.','#','#','#','#','#','.','#','#','.','#'},
					{'#','.','#','#','#','#','#','.','#','#','.','#'},
					{'#','.','#','#','.','.','.','.','.','.','.','#'},
					{'#','.','#','#','.','#','#','#','.','#','.','#'},
					{'#','.','.','.','.','#','#','#','.','#','.','#'},
					{'#','#','.','#','.','#','#','#','.','#','.','B'},
					{'#','#','.','#','#','#','.','.','.','#','#','#'},
					{'#','#','#','#','#','#','#','#','#','#','#','#'}};

	public void show()
	{
		for(int i=0; i<circuit.length; i++)
		{
			for(int j=0; j<circuit[i].length; j++)
				System.out.print(" " + circuit[i][j]);
			System.out.println();
		}
	}


	//把与from集合中相邻的可染色节点染色，被染色节点记入 dest
	//一旦发现出口将被染色，则返回当前的“传播源”节点
	public Cell colorCell(Set<Cell> from, Set<Cell> dest)
	{
		Iterator<Cell> it = from.iterator();
		while(it.hasNext())
		{
			Cell a = it.next();
			Cell[] c = new Cell[4];//用于存放a方格的上下左右四个方格
			c[0] = new Cell(a.row-1, a.col, a);
			c[1] = new Cell(a.row, a.col-1, a);
			c[2] = new Cell(a.row+1, a.col, a);
			c[3] = new Cell(a.row, a.col+1, a);//填空

			for(int i=0; i<4; i++)
			{   //碰到墙结束本次循环
				if(c[i].row < 0 || c[i].row >= circuit.length) continue;
				if(c[i].col < 0 || c[i].col >= circuit[0].length) continue;

				char x = circuit[c[i].row][c[i].col];//获取当前方格的状态
				if(x=='E') return a;//到达终点
				if(x=='.') //此方格可行,进行染色,并将该方格加入dest列表
				{
					circuit[c[i].row][c[i].col] = '?';
					dest.add(c[i]);//填空
				}
			}
		}
		return null;
	}

	/*
	 * 判断从源点到终点是否有可行通路
	 * 有的话采用回溯法对可行通路进行标识
	 */
	public void resolve()
	{
		int count=0;
		Set<Cell> set = new HashSet<Cell>();
		set.add(new Cell(9,11,null));
		circuit[9][11]='B';
		for(;;)
		{
			Set<Cell> set1 = new HashSet<Cell>();
			Cell a = colorCell(set, set1);
			if(a!=null)
			{
				System.out.println("找到解！");
				while(a!=null)
				{
					if(circuit[a.row][a.col]!='B')circuit[a.row][a.col] = '+';
					a=a.from;//填空
					count++;
				}
				System.out.println("线路长度为："+count);
				break;
			}
			if(set1.isEmpty())
			{
				System.out.println("无解！");
				break;
			}
			set = set1;
		}
	}

	public static void main(String[] args)
	{
		Circuit m = new Circuit();
		m.show();
		m.resolve();
		m.show();
	}
}

