import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/5
 * Project: Ben-leetcode-practice
 */
class leetcode726Test {

    @Test
    void removeSpace() {
        assertEquals("H2O", leetcode726.removeSpace("H2O"));
        assertEquals("MgO2H2", leetcode726.removeSpace("Mg O2H2 2"));
        assertEquals("K4O2N2S4O12", leetcode726.removeSpace("K4 O2N2S4O12 2"));
        assertEquals("Be32", leetcode726.removeSpace("Be32"));
        assertEquals("H21O", leetcode726.removeSpace("H21O"));
        assertEquals("MgO4H2", leetcode726.removeSpace("Mg O4H2 2"));
        assertEquals("MgO4H2", leetcode726.removeSpace("Mg O4H2 2"));
    }

    @Test
    void countOfAtoms() {
        assertEquals("H2O", leetcode726.countOfAtoms("H2O"));
        assertEquals("H2MgO2", leetcode726.countOfAtoms("Mg(OH)2"));
        assertEquals("K4N2O14S4", leetcode726.countOfAtoms("K4(ON(SO3)2)2"));
        assertEquals("Be32", leetcode726.countOfAtoms("Be32"));
        assertEquals("H21O", leetcode726.countOfAtoms("H21O"));
        assertEquals("H2MgO4", leetcode726.countOfAtoms("Mg(O2H)2"));
        assertEquals("B78Be1950He663O1521", leetcode726.countOfAtoms("(B2O39He17BeBe49)39"));
        assertEquals("Be7956H306He8874", leetcode726.countOfAtoms("((HHe28Be26He)9)34"));
        assertEquals("Al252586Ar16422As30600At339456B200770Ba435047Be16813Bh396950Bi8075Bk20400Br12750Cd437138Cf627181Cl147798Cn394213Co212704Cr18275Cs584902Db20400Ds109480Dy99144Er656880Es624036Fe14467Fl16813Fm425Fr1564Ga120037H1275He18700Hg344862Ho737426Hs78676I641240In673302Ir353073K168912Kr920414La587197Li379950Lr17238Lu7922Lv17204Mc285821Mn142800Mt453934N538016Na186116Nd248880Ne538016Nh13294Np44200O225216Og1309P982600Pb3400Pd10931Pm100096Po448443Pt708883Pu16575Rb449650Re590750Rf2188410Rg19363Rh767975Rn22100S261970Sb249900Sc12750Se856800Sg312800Sr16813Ta108613Tb620976Tc612017Te1256640Th14467Ti35700Tl11356Ts16932W554829Xe470764Y31280Yb18275Zn1448655Zr30515", leetcode726.countOfAtoms("((Bi16LrSc30As49As23La13La(Ba21Re28BkRf40DbP29SeSe41La27Cn16)48(TcRn)49(Sb28Ti4Po35Mn16)21(Ta36Tl2Br5Dy21S41)6(Bh37Li36O20Tb48)24Cr43Pd11Pu39OgYb43Zr35FmHe44(Rh35BiLaCf4RnHLi10RgLuRg)3(Cn15PbS44Nd18)8)25((Hs11B41Rf46)20(At48Te45)32(Cs15Mt19OgHs34Ts5La33Ga23Np50Dy33O24)4)13((Po21ZnPdK27Pm16TlCo34Nd30Y4N)16(Nh2BaNa28Ga15LuAl38)17(Rb23ReRf2Rf33I32Te48Bh)50(Cf37Ne32W33BeRgIr21Cs34Mc17Zn43)43(Ho23ArEs38Er40Tb8DyIn41Tc36Hg21Cl9)42(Y8B25Ts16S10Fr2Lv22Po6)2(Zn46N34Ds7Sg20HoRf31P25ZrIHo22)40(FeRh50Kr9ThPt49)37(TaLrKr35Kr12SrCd26Xe28Mt26CnFl)43)23)17"));
        assertEquals("La3040", leetcode726.countOfAtoms("((La13La(La)5)10)16"));
        assertEquals("La3040", leetcode726.countOfAtoms("((Md16Cm19HfNe47K29(NeW42ZrPd9)17Ag7Ar6P9HsFr18Ar18O31Tc5Md42(W6Sn5Er29SB40Ho42Co31Si42)44)7(La24Au2Bh12MoFr11LaHf24Re13Bh20Sc2)41(Tb33BLi14Al35Cu14)9Rh5Tl(Cr3SNd20Fe)14B27Cf48H11Sb8Sb25HsRhCm40(Fe4Cs13At49)26((Co6RnMg15Be30Hs9)40(Rg43SNoCn29F)2(Md25DbMn27Ni41)22(Ac28Pu50PdHoNa50)40(Fm28B15In)16(Pb41PmHf24Zn4Ts39Np25Tl47Lu47)6(Ru3Ni20Sm35)16(Ru23RaAt5Cs15Ga)8(Ra26Sb16Cr44Ds25Ar23Pm34C49)6)41(ThBSc15W(Nh12Li42Ts5Sr11Mn2Ga22W3)40(Bh50No12Zr43Mo18As18Sc17Ti17Ca28Tc50)11)6(Pr(Sb46Dy14Fe11)42(Cd14AlPd28Li13Sm4Fm50F33Ti)38(Bk14Fl50)31)4(N18Am45Cl36(Pr32Ta3Am)39Th36Si50NiDsEr50Am8Co25Pu24Ts17Ge37Ce36Re10TcSnWZn38No35Ar18Rf33P8(La5)7(Lr43Sg40)36(Au12HfCr10Fr40)37)9((Mn15Co20U9)5LvRb48LrLv37No(Pt20Tl44Nd31Cu32Ga19Lu4Es35)29(Po47Te47Na29Nh48VF28O28Ti46Cu28)45(Co8Bh5)20)43)35"));
    }

    @Test
    void toLongForm() {
        assertEquals(" B78O1521He663Be39Be1911 39", leetcode726.toLongForm("(B2O39He17BeBe49)39"));
        assertEquals(" H306He8568Be7956He306 34", leetcode726.toLongForm("((HHe28Be26He)9)34"));
        assertEquals(" La2080La160La800 16", leetcode726.toLongForm("((La13La(La)5)10)16"));
    }
}