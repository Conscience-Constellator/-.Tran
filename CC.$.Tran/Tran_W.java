package CC.$;

import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;

import static CC.COd.Neds_Ovrid.*;

public interface Tran_W<From_Typ,W_Typ,To_Typ>
	extends Rsult_Typ_Havr<To_Typ>
{
	default Tran_W<From_Typ,W_Typ,To_Typ> Min_Tran()
	{return this;}

	@Lin_DclAr
	void Tran_W_AB(From_Typ From,W_Typ W,To_Typ To);
		@Lin_DclAr @Neds_Ovrid(NEds=Nutrl)
		default void Tran_W_SLf(W_Typ W,To_Typ Froto)
		{Tran_W_AB((From_Typ)Froto,W,Froto);}
}