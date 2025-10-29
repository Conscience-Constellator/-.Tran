package CC.$;

import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;
import CC.COd.UnUsd;

/**An object which can calculate A location to 1 relative to this.*/
public interface Tran<From_Typ,To_Typ> extends Tran_W<From_Typ,Object,To_Typ>
{
	@Override
	default Tran<From_Typ,To_Typ> Min_Tran()
	{return this;}

	@Lin_DclAr
	void Tran_AB(From_Typ From,To_Typ To);
		@Override @Neds_Ovrid(NEds=Nutrl)
		default void Tran_W_AB(From_Typ From,@UnUsd Object W,To_Typ To)
		{Tran_AB(From,To);}
		@Lin_DclAr @Neds_Ovrid(NEds=Nutrl)
		default void Tran_SLf(To_Typ Froto)
		{Tran_AB((From_Typ)Froto,Froto);}
			@Override @Neds_Ovrid(NEds=No)
			default void Tran_W_SLf(@UnUsd Object W,To_Typ Froto)
			{Tran_SLf(Froto);}
}