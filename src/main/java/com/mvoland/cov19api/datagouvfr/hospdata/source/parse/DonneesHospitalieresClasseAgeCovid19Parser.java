package com.mvoland.cov19api.datagouvfr.hospdata.source.parse;

import com.mvoland.cov19api.datagouvfr.common.SourceParser;
import com.mvoland.cov19api.datagouvfr.common.ParsingUtils;
import com.mvoland.cov19api.datagouvfr.hospdata.data.DonneesHospitalieresClasseAgeCovid19;

public class DonneesHospitalieresClasseAgeCovid19Parser implements SourceParser<DonneesHospitalieresClasseAgeCovid19> {
    @Override
    public DonneesHospitalieresClasseAgeCovid19 parse(String[] rowValues) {
        DonneesHospitalieresClasseAgeCovid19 data = new DonneesHospitalieresClasseAgeCovid19();
        data.setReg(ParsingUtils.parseIntegerOrThrow(rowValues[0]));
        data.setCl_age90(ParsingUtils.parseAgeGroupOrThrow(rowValues[1]));
        data.setJour(ParsingUtils.parseDateOrThrow(rowValues[2]));
        data.setHosp(ParsingUtils.parseIntegerOrDefault(rowValues[3], 0));
        data.setRea(ParsingUtils.parseIntegerOrDefault(rowValues[4], 0));
        data.setRad(ParsingUtils.parseIntegerOrDefault(rowValues[5], 0));
        data.setDc(ParsingUtils.parseIntegerOrDefault(rowValues[6], 0));
        return data;
    }
}
