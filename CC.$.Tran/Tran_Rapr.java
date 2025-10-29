package CC.$;

import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import org.jetbrains.annotations.NotNull;

public interface Tran_Rapr<
	From_Typ,To_Typ,
	Tran_Typ extends Tran_W<From_Typ,Object,To_Typ>>
	extends Tran_Revbl<
		From_Typ,To_Typ>
{
	Tran_W<From_Typ,Object,To_Typ> Get_Rapd_Tran();
		@Override @Neds_Ovrid(NEds=Nutrl)
		default Tran<From_Typ,To_Typ> Min_Tran()
		{return (Tran<From_Typ,To_Typ>)Get_Rapd_Tran().Min_Tran();}
	void Set_Rapd_Tran(Tran_Typ Tran);

	@Override
	default void Tran_W_AB(From_Typ From,Object W,To_Typ To)
	{Get_Rapd_Tran().Tran_W_AB(From,W,To);}
		@Override
		default void Tran_W_SLf(Object W,To_Typ Froto)
		{Get_Rapd_Tran().Tran_W_SLf(W,Froto);}
	@Override
	default void Tran_AB(From_Typ From,To_Typ To)
	{((Tran<From_Typ,To_Typ>)Get_Rapd_Tran()).Tran_AB(From,To);}
		@Override
		default void Tran_SLf(To_Typ Froto)
		{((Tran<From_Typ,To_Typ>)Get_Rapd_Tran()).Tran_SLf(Froto);}
	@Override
	default void Tran_W_Rev_AB(From_Typ From,Object W,To_Typ To)
	{((Tran_W_Revbl)Get_Rapd_Tran()).Tran_W_Rev_AB(From,W,To);}
		@Override
		default void Tran_W_Rev_SLf(Object W,To_Typ Froto)
		{((Tran_W_Revbl<From_Typ,Object,To_Typ>)Get_Rapd_Tran()).Tran_W_Rev_SLf(W,Froto);}
	@Override
	default void Tran_Rev_AB(From_Typ From,To_Typ To)
	{((Tran_Revbl<From_Typ,To_Typ>)Get_Rapd_Tran()).Tran_Rev_AB(From,To);}
		@Override
		default void Tran_Rev_SLf(To_Typ Froto)
		{((Tran_Revbl<From_Typ,To_Typ>)Get_Rapd_Tran()).Tran_Rev_SLf(Froto);}

	class Tran_Rapr_Imp<
		From_Typ,To_Typ,
		Tran_Typ extends Tran_W<From_Typ,Object,To_Typ>>
		implements Tran_Rapr<
			From_Typ,To_Typ,
			Tran_Typ>
	{
		public Tran_Typ Rapd_Tran;
			@Override
			public @NotNull Tran_Typ Get_Rapd_Tran()
			{return Rapd_Tran;}
			@Override
			public void Set_Rapd_Tran(@NotNull Tran_Typ Rapd)
			{this.Rapd_Tran=Rapd;}

		public Tran_Rapr_Imp(@NotNull Tran_Typ Rapd)
		{Set_Rapd_Tran(Rapd);}
		public Tran_Rapr_Imp()
		{}
	}
}