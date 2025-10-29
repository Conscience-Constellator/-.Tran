package CC.$;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

public interface Tran_W_Revbl<From_Typ,W_Typ,To_Typ>
	extends Tran_W<From_Typ,W_Typ,To_Typ>
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Tran_W_Rev_AB(From_Typ From,W_Typ W,To_Typ To);
		@Lin_DclAr @Neds_Ovrid(NEds=Nutrl) @Finishd(Is_Finishd=false)
		default void Tran_W_Rev_SLf(W_Typ W,To_Typ Froto)
		{Tran_W_Rev_AB((From_Typ)Froto,W,Froto);}
}