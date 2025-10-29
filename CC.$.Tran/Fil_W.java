package CC.$;

import CC.$.Tran_Rapr.Tran_Rapr_Imp;

public class Fil_W<
	From_Typ,W_Typ,To_Typ,
	Tran_Typ extends Tran_W<From_Typ,Object,To_Typ>>
	extends Tran_Rapr_Imp<From_Typ,To_Typ,Tran_Typ>
{
	public W_Typ W;

	@Override
	public void Tran_AB(From_Typ From,To_Typ To)
	{Get_Rapd_Tran().Tran_W_AB(From,W,To);}
	@Override
	public void Tran_SLf(To_Typ Froto)
	{Get_Rapd_Tran().Tran_W_SLf(W,Froto);}
	@Override
	public void Tran_Rev_AB(From_Typ From,To_Typ To)
	{((Tran_W_Revbl<From_Typ,Object,To_Typ>)Get_Rapd_Tran()).Tran_W_Rev_AB(From,W,To);}
	@Override
	public void Tran_Rev_SLf(To_Typ Froto)
	{((Tran_W_Revbl<From_Typ,Object,To_Typ>)Get_Rapd_Tran()).Tran_W_Rev_SLf(W,Froto);}

	public Fil_W(Tran_Typ Rapd_Tran,W_Typ W)
	{
		super(Rapd_Tran);
		this.W=W;
	}
}