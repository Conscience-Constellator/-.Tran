package CC.$;

import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;
import CC.COd.UnUsd;

public interface Tran_Revbl<From_Typ,To_Typ> extends
	Tran<From_Typ,To_Typ>,
	Tran_W_Revbl<From_Typ,Object,To_Typ>
{
	@Lin_DclAr
	void Tran_Rev_AB(From_Typ From,To_Typ To);
		@Override @Neds_Ovrid(NEds=No)
		default void Tran_W_Rev_AB(From_Typ From,@UnUsd Object W,To_Typ To)
		{Tran_Rev_AB(From,To);}
		@Lin_DclAr @Neds_Ovrid(NEds=Nutrl)
		default void Tran_Rev_SLf(To_Typ Froto)
		{Tran_Rev_AB((From_Typ)Froto,Froto);}
			@Override @Neds_Ovrid(NEds=No)
			default void Tran_W_Rev_SLf(@UnUsd Object W,To_Typ Froto)
			{Tran_Rev_SLf(Froto);}
}