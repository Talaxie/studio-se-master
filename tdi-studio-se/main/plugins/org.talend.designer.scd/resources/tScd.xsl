<?xml version="1.0" encoding="utf-8"?>
<!-- edited with XMLSpy v2007 sp1 (http://www.altova.com) by () -->
<xsl:stylesheet version="1.1"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<b class="FONTSTYLE">
			<xsl:value-of
				select="/externalNode/@i18n.scd.properties.for" />
			<xsl:text> </xsl:text>
			<xsl:value-of select="/externalNode/@name" />
			:
		</b>
		<table border="0" width="96%" cellpadding="0" cellspacing="0"
			summary="">
			<tr>
				<td width="15" />
				<td>
					<xsl:if test="/externalNode/unUsed/field">
						<table class="cols" border="1" width="90%" cellpadding="0"
							cellspacing="0"
							style="border-collapse: collapse; padding-left: 10mm;"
							bordercolor="#111111" frame="box" summary="">
							<tr>
								<th align="middle" width="100%" class="TABLECOLUMNSTYLE">
									<xsl:value-of
										select="/externalNode/@i18n.scd.unused" />
								</th>
							</tr>
							<xsl:for-each select="/externalNode/unUsed/field">
								<tr>
									<td class="FONTSTYLE" align="left">
										<xsl:value-of select="@name" />
									</td>
								</tr>
							</xsl:for-each>
						</table>
						<br />
					</xsl:if>
					<xsl:if test="/externalNode/sourceKeys/key">
						<table class="cols" border="1" width="90%" cellpadding="0"
							cellspacing="0"
							style="border-collapse: collapse; padding-left: 10mm;"
							bordercolor="#111111" frame="box" summary="">
							<tr>
								<th align="middle" width="100%" class="TABLECOLUMNSTYLE">
									<xsl:value-of
										select="/externalNode/@i18n.scd.sourceKeys" />
								</th>
							</tr>
							<xsl:for-each select="/externalNode/sourceKeys/key">
								<tr>
									<td class="FONTSTYLE" align="left">
										<xsl:value-of select="@name" />
									</td>
								</tr>
							</xsl:for-each>
						</table>
						<br />
					</xsl:if>
					<xsl:if test="/externalNode/surrogateKeys/key">
						<table class="cols" width="90%" cellpadding="0" border="1"
							cellspacing="0" style="border-collapse: collapse"
							bordercolor="#111111" frame="box" summary="">
							<tr>
								<th align="middle" width="100%" colspan="2"
									class="TABLECOLUMNSTYLE">
									<xsl:value-of
										select="/externalNode/@i18n.scd.surrogateKeys" />
								</th>
							</tr>
							<tr class="FONTSTYLE">
								<td class="TABLECOLUMNSTYLE" width="50%" align="left">
									<xsl:value-of
										select="/externalNode/@i18n.scd.name" />
								</td>
								<td width="50%">
									<xsl:value-of
										select="/externalNode/surrogateKeys/key/@name" />
								</td>
							</tr>
							<tr class="FONTSTYLE">
								<td class="TABLECOLUMNSTYLE" width="50%" align="left">
									<xsl:value-of
										select="/externalNode/@i18n.scd.creation" />
								</td>
								<td width="50%">
									<xsl:value-of
										select="/externalNode/surrogateKeys/key/@creation" />
								</td>
							</tr>
							<tr class="FONTSTYLE">
								<td class="TABLECOLUMNSTYLE" width="50%" align="left">
									<xsl:value-of
										select="/externalNode/@i18n.scd.complement" />
								</td>
								<td width="50%">
									<xsl:value-of
										select="/externalNode/surrogateKeys/key/@complement" />
								</td>
							</tr>
						</table>
						<br />
					</xsl:if>
					<xsl:if test="/externalNode/type0Fields/field">
						<table class="cols" border="1" width="90%" cellpadding="0"
							cellspacing="0"
							style="border-collapse: collapse; padding-left: 10mm;"
							bordercolor="#111111" frame="box" summary="">
							<tr>
								<th align="middle" width="100%" class="TABLECOLUMNSTYLE">
									<xsl:value-of
										select="/externalNode/@i18n.scd.type0Fields" />
								</th>
							</tr>
							<xsl:for-each
								select="/externalNode/type0Fields/field">
								<tr>
									<td class="FONTSTYLE" align="left">
										<xsl:value-of select="@name" />
									</td>
								</tr>
							</xsl:for-each>
						</table>
						<br />
					</xsl:if>
					<xsl:if test="/externalNode/type1Fields/field">
						<table class="cols" border="1" width="90%" cellpadding="0"
							cellspacing="0"
							style="border-collapse: collapse; padding-left: 10mm;"
							bordercolor="#111111" frame="box" summary="">
							<tr>
								<th align="middle" width="100%" class="TABLECOLUMNSTYLE">
									<xsl:value-of
										select="/externalNode/@i18n.scd.type1Fields" />
								</th>
							</tr>
							<xsl:for-each
								select="/externalNode/type1Fields/field">
								<tr>
									<td class="FONTSTYLE" align="left">
										<xsl:value-of select="@name" />
									</td>
								</tr>
							</xsl:for-each>
						</table>
						<br />
					</xsl:if>
					<xsl:if test="/externalNode/type2Fields/field">
						<table class="cols" border="1" width="90%" cellpadding="0"
							cellspacing="0"
							style="border-collapse: collapse; padding-left: 10mm;"
							bordercolor="#111111" frame="box" summary="">
							<tr>
								<td class="TABLECOLUMNSTYLE" colspan="5" width="100%"
									align="middle">
									<b class="FONTSTYLE">
										<xsl:value-of
											select="/externalNode/@i18n.scd.type2Fields" />
									</b>
								</td>
							</tr>
							<xsl:for-each
								select="/externalNode/type2Fields/field">
								<tr>
									<td class="FONTSTYLE" colspan="5" align="left">
										<xsl:value-of select="@name" />
									</td>
								</tr>
							</xsl:for-each>
							<tr>
								<td class="TABLECOLUMNSTYLE" colspan="5" width="100%"
									align="middle">
									<b class="FONTSTYLE">
										<xsl:value-of
											select="/externalNode/@i18n.scd.versioning" />
									</b>
								</td>
							</tr>
							<tr>
								<th align="left" width="8%" class="TABLECOLUMNSTYLE"></th>
								<th align="left" width="23%" class="TABLECOLUMNSTYLE">
									<xsl:value-of
										select="/externalNode/@i18n.scd.type" />
								</th>
								<th align="left" width="23%" class="TABLECOLUMNSTYLE">
									<xsl:value-of
										select="/externalNode/@i18n.scd.name" />
								</th>
								<th align="left" width="23%" class="TABLECOLUMNSTYLE">
									<xsl:value-of
										select="/externalNode/@i18n.scd.creation" />
								</th>
								<th align="left" width="23%" class="TABLECOLUMNSTYLE">
									<xsl:value-of
										select="/externalNode/@i18n.scd.complement" />
								</th>
							</tr>
							<xsl:for-each
								select="/externalNode/type2Fields/versioning/entry">
								<tr class="FONTSTYLE">
									<td width="8%" align="left">
										<xsl:if test="@checked = 'true' ">
											<img src="pictures/checked.png" alt="&#9745;"
												class="bordercolor" />
										</xsl:if>
										<xsl:if test="@checked = 'false' ">
											<img src="pictures/unchecked.png" alt="&#9746;"
												class="bordercolor" />
										</xsl:if>
										<xsl:if test="@checked = 'TRUE' ">
											<img src="pictures/checked.png" alt="&#9745;"
												class="bordercolor" />
										</xsl:if>
										<xsl:if test="@checked = 'FALSE' ">
											<img src="pictures/unchecked.png" alt="&#9746;"
												class="bordercolor" />
										</xsl:if>
									</td>
									<td width="23%" align="left">
										<xsl:value-of select="@type" />
									</td>
									<td width="23%" align="left">
										<xsl:value-of select="@name" />
									</td>
									<td width="23%" align="left">
										<xsl:value-of select="@creation" />
									</td>
									<td width="23%" align="left">
										<xsl:value-of select="@complement" />
									</td>
								</tr>
							</xsl:for-each>
						</table>
						<br />
					</xsl:if>
					<xsl:if test="/externalNode/type3Fields/field">
						<table class="cols" width="90%" cellpadding="0" border="1"
							cellspacing="0" style="border-collapse: collapse"
							bordercolor="#111111" frame="box" summary="">
							<tr>
								<td class="TABLECOLUMNSTYLE" colspan="2" width="100%"
									align="middle">
									<b class="FONTSTYLE">
										<xsl:value-of
											select="/externalNode/@i18n.scd.type3Fields" />
									</b>
								</td>
							</tr>
							<tr>
								<th align="left" width="50%" class="TABLECOLUMNSTYLE">
									<xsl:value-of
										select="/externalNode/@i18n.scd.currentValue" />
								</th>
								<th align="left" width="50%" class="TABLECOLUMNSTYLE">
									<xsl:value-of
										select="/externalNode/@i18n.scd.previousValue" />
								</th>
							</tr>
							<xsl:for-each
								select="/externalNode/type3Fields/field">
								<tr class="FONTSTYLE">
									<td width="50%" align="left">
										<xsl:value-of select="@currentValue" />
									</td>
									<td width="50%">
										<xsl:value-of select="@previousValue" />
									</td>
								</tr>
							</xsl:for-each>
						</table>
						<br />
					</xsl:if>
				</td>
			</tr>
		</table>
		<br />
	</xsl:template>
</xsl:stylesheet>
