package CC.$;

import CC.Util.Setbl_From;

public class Trang<
	ValU_Typ,
	From_Typ,
	To_Typ extends Setbl_From<From_Typ>,
	Tran_Typ> implements Tran_Revbl<From_Typ,To_Typ>
{
	public Tran_Typ[] List;
	@Override
	public void Tran_W_AB(From_Typ From,Object W,To_Typ To)
	{
		To.Set_Sorc(From);
		Tran_W_SLf(W,To);
	}
		@Override
		public void Tran_W_SLf(Object W,To_Typ Froto)
		{
			for(Tran_Typ Tran:List)
			{
				((Tran_W<From_Typ,Object,To_Typ>)Tran).Tran_W_SLf(W,Froto);

//				out.println("->"+Froto);
			}
		}
	@Override
	public void Tran_W_Rev_AB(From_Typ From,Object W,To_Typ To)
	{
		To.Set_Sorc(From);
		Tran_SLf(To);
	}
		@Override
		public void Tran_W_Rev_SLf(Object W,To_Typ Froto)
		{
			for(Tran_Typ Tran:List)
			{
				((Tran_W_Revbl<From_Typ,Object,To_Typ>)Tran).Tran_W_Rev_SLf(W,Froto);

//				out.println("->"+Froto);
			}
		}
	@Override
	public void Tran_AB(From_Typ From,To_Typ To)
	{
		To.Set_Sorc(From);
		Tran_SLf(To);
	}
		@Override
		public void Tran_SLf(To_Typ Froto)
		{
			for(Tran_Typ Tran:List)
			{
				((Tran<From_Typ,To_Typ>)Tran).Tran_SLf(Froto);

//				out.println("->"+Froto);
			}
		}
	@Override
	public void Tran_Rev_AB(From_Typ From,To_Typ To)
	{
		To.Set_Sorc(From);
		Tran_SLf(To);
	}
		@Override
		public void Tran_Rev_SLf(To_Typ Froto)
		{
			for(Tran_Typ Tran:List)
			{
				((Tran_Revbl<From_Typ,To_Typ>)Tran).Tran_Rev_SLf(Froto);

//				out.println("->"+Froto);
			}
		}

	public Trang(Tran_Typ... List)
	{this.List=List;}
}